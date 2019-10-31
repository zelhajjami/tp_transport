package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import util.HibernateUtil;

public class TestDao {

	public static void main(String[] args) {
		TransportDaoImpl dao = new TransportDaoImpl();
		dao.addCargaison(new CargaisonAerienne("CA1", 500, new Date(), 700));
		dao.addCargaison(new CargaisonAerienne("CA2", 600, new Date(), 200));
		dao.addCargaison(new CargaisonRoutiere("CR1", 800, new Date(), 23));
		
		dao.addMarchandise(new Marchandise(200, 400, "Ordinateur"), "CA1");
		dao.addMarchandise(new Marchandise(100, 400, "Impr"), "CA1");
		dao.addMarchandise(new Marchandise(150, 400, "CD"), "CR1");
		dao.addMarchandise(new Marchandise(200, 400, "Tablettes"), "CA2");
	}
}
