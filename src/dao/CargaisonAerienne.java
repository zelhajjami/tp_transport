package dao;

import java.util.Date;

public class CargaisonAerienne extends Cargaison {
	private double poidsMax;

	
	
	/**
	 * @param reference
	 * @param distance
	 * @param dateLivraison
	 * @param poidsMax
	 */
	public CargaisonAerienne(String reference, double distance, Date dateLivraison, double poidsMax) {
		super(reference, distance, dateLivraison);
		this.poidsMax = poidsMax;
	}

	public CargaisonAerienne() {
		super();
	}

	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
}
