package es.pildoras.hibernateConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory myFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(ClientDetails.class)
				.buildSessionFactory();
		
		Session mySession=myFactory.openSession();
		
		try { 
			
			mySession.beginTransaction();
			
			Client theClient=mySession.get(Client.class, 8);
			
			if(theClient != null) {
				mySession.delete(theClient);
			}
			mySession.getTransaction().commit();
			
			//Deletee reading
			if(theClient != null) {System.out.println("Register deleted correctly");}
			
			mySession.close();
			
			
	}
		finally {
			
			myFactory.close();
			
		}
		

		
	}

}
