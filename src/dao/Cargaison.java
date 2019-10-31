package dao;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Cargaison implements Serializable{
	private String reference;
	private double distance;
	private Date dateLivraison;
	private Set<Marchandise> marchandises = new HashSet<Marchandise>();
	
	
	public Cargaison() {
		super();
	}
	public Cargaison(String reference, double distance, Date dateLivraison) {
		super();
		this.reference = reference;
		this.distance = distance;
		this.dateLivraison = dateLivraison;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Set<Marchandise> getMarchandises() {
		return marchandises;
	}
	public void setMarchandises(Set<Marchandise> marchandises) {
		this.marchandises = marchandises;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	
	
}
