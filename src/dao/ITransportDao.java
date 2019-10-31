package dao;

import java.util.List;

public interface ITransportDao {
	public void addCargaison(Cargaison c);
	public void addMarchandise(Marchandise m, String refCarg);
	public List<Cargaison> getAllCargaison();
	public List<Marchandise> getMarchandise(String refCarg);
	public List<Marchandise> getMarchandiseParMc(String mc);
	public Cargaison getCargaison(String refCarg);
	public void suprimerMarchandise(Long num);
}
