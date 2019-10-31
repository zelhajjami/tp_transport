package dao;

import java.util.Date;

public class CargaisonRoutiere extends Cargaison{
	private double temperature;

	/**
	 * 
	 */
	public CargaisonRoutiere() {
		super();
	}

	/**
	 * @param reference
	 * @param distance
	 * @param dateLivraison
	 * @param temperature
	 */
	public CargaisonRoutiere(String reference, double distance, Date dateLivraison, double temperature) {
		super(reference, distance, dateLivraison);
		this.temperature = temperature;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	
}
