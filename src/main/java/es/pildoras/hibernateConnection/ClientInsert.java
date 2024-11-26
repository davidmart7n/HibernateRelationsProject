package es.pildoras.hibernateConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory myFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(ClientDetails.class)
				.buildSessionFactory();
		
		Session mySession=myFactory.openSession();
		
		try { 
			
			Client client1 = new Client("Jose","MIGUEL","Llobregat");
			ClientDetails client1Details = new ClientDetails("www.JOSEMIGUEL.es","6779987654","Jose mi");
			
			//Objects Association 
			client1.setClientDetails(client1Details);
			
			mySession.beginTransaction();
			
			//This saves the info in the 2 relationed tables
			mySession.save(client1);
			
			mySession.getTransaction().commit();
			
			System.out.println("Register Succesfull in DB!");
			
			//Register reading
			System.out.println("Reading from the Register with ID: " + client1.getId());
			
			mySession.close();
			
			
	}
		finally {
			
			myFactory.close();
			
		}
		

		
	}

}
