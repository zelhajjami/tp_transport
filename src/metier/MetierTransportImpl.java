package metier;

import java.util.List;

import dao.Cargaison;
import dao.ITransportDao;
import dao.Marchandise;

public class MetierTransportImpl implements ITansportMetier {

	private ITransportDao dao;
	
	
	
	public ITransportDao getDao() {
		return dao;
	}

	public void setDao(ITransportDao dao) {
		this.dao = dao;
		System.out.println("Injection DAO");
	}

	@Override
	public void addCargaison(Cargaison c) {
		dao.addCargaison(c);
	}

	@Override
	public void addMarchandise(Marchandise m, String refCarg) {
		dao.addMarchandise(m, refCarg);
	}

	@Override
	public List<Cargaison> getAllCargaison() {
		// TODO Auto-generated method stub
		return dao.getAllCargaison();
	}

	@Override
	public List<Marchandise> getMarchandise(String refCarg) {
		// TODO Auto-generated method stub
		return dao.getMarchandise(refCarg);
	}

	@Override
	public List<Marchandise> getMarchandiseParMc(String mc) {
		// TODO Auto-generated method stub
		return dao.getMarchandiseParMc(mc);
	}

	@Override
	public Cargaison getCargaison(String refCarg) {
		// TODO Auto-generated method stub
		return dao.getCargaison(refCarg);
	}

	@Override
	public void suprimerMarchandise(Long num) {
		// TODO Auto-generated method stub
		dao.suprimerMarchandise(num);
	}
	
	public void init() {
		System.out.println("initialisation métier");
	}

}
