package es.pildoras.hibernateConnection;

import java.util.Date;

import javax.persistence.ManyToOne;

public class Orderd {
	
	
	private int id;
	
	private Date Dated;
	
	private String paymentMethod;
	
	@ManyToOne
	private Client theClient;

}
