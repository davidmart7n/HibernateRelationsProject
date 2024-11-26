package es.pildoras.hibernateTrials;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTrials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String jdbcUrl="jdbc:mysql://localhost:3306/hibernaterelations?useSSL=false";
	
	String user="root";
	
	String password="";
	
	try {
		System.out.println("Trying to connect with DB: "+ jdbcUrl);
		
		Connection myConnection=DriverManager.getConnection(jdbcUrl, user, password);
		
		System.out.println("Connection succesfull");
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}

}
}