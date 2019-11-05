package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.query.Query;
import org.hibernate.Session;

import util.HibernateUtil;

public class TransportDaoImpl implements ITransportDao{

	@Override
	public void addCargaison(Cargaison c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public void addMarchandise(Marchandise m, String refCarg) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Cargaison c = session.get(Cargaison.class, refCarg);
		m.setCargaison(c);
		c.getMarchandises().add(m);
		session.save(m);
		session.getTransaction().commit();
	}

	@Override
	public List<Cargaison> getAllCargaison() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query req = session.createQuery("select c from Cargaison c");
		
		return req.list();
		
		//return session.createQuery("SELECT c FROM Cargaison c", Cargaison.class).getResultList();
	}

	@Override
	public List<Marchandise> getMarchandise(String refCarg) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Query req = session.createQuery("select m from Marchandise m where m.cargaison.reference=:x");
		req.setParameter("x", refCarg);
		return req.list();
	}

	@Override
	public List<Marchandise> getMarchandiseParMc(String mc) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Query req = session.createQuery("select m from Marchandise m where m.nom like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.list();
	}

	@Override
	public Cargaison getCargaison(String refCarg) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Cargaison c = session.get(Cargaison.class, refCarg);
		
		return c;
	}

	@Override
	public void suprimerMarchandise(Long num) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Marchandise m = session.get(Marchandise.class, num);
		session.delete(m);
		session.getTransaction().commit();
	}

}
