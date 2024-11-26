package es.pildoras.hibernateConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		// TODO Auto-generated method stub

		SessionFactory myFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(ClientDetails.class)
				.buildSessionFactory();
		
		Session mySession=myFactory.openSession();
		
		try { 
			
			mySession.beginTransaction();
			
			//Obtain ClientDetails
			
			ClientDetails theClient=mySession.get(ClientDetails.class, 8);
			
			System.out.println(theClient.toString());
			
			System.out.println(theClient.getTheClient());
			
			System.out.println("Cascade Delete");
			
			mySession.delete(theClient);
			
			mySession.getTransaction().commit();			
			
	}
		catch(Exception ex1){
			
			ex1.printStackTrace();
			
		}
		
		finally {
			
			mySession.close();

			myFactory.close();
		}
		

	}

}
