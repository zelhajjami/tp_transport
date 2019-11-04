package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.HibernateUtil;

public class TestDao {

	public static void main(String[] args) {
		TransportDaoImpl dao = new TransportDaoImpl();
		/*dao.addCargaison(new CargaisonAerienne("CA3", 300, new Date(), 1100));
		dao.addCargaison(new CargaisonAerienne("CA4", 250, new Date(), 900));
		dao.addCargaison(new CargaisonRoutiere("CR2", 620, new Date(), 20));
		
		dao.addMarchandise(new Marchandise(200, 400, "carte graphique"), "CA3");
		dao.addMarchandise(new Marchandise(100, 400, "souris"), "CA4");
		dao.addMarchandise(new Marchandise(150, 400, "DVD"), "CR2");
		dao.addMarchandise(new Marchandise(200, 400, "smartphone"), "CA4");
		*/
		
		List<Marchandise> marchandises = new ArrayList<>();
		
		marchandises = dao.getMarchandise("CA3");
		System.out.println("------");
		for(Marchandise m: marchandises)
		{
			System.out.println("---------");
			System.out.println(m.getNom());
		}
	}
}
