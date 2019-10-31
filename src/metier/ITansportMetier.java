package metier;

import java.util.List;

import dao.Cargaison;
import dao.Marchandise;

public interface ITansportMetier {
	public void addCargaison(Cargaison c);
	public void addMarchandise(Marchandise m, String refCarg);
	public List<Cargaison> getAllCargaison();
	public List<Marchandise> getMarchandise(String refCarg);
	public List<Marchandise> getMarchandiseParMc(String mc);
	public Cargaison getCargaison(String refCarg);
	public void suprimerMarchandise(Long num);
}
