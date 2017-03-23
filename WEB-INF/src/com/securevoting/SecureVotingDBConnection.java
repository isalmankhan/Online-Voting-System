package com.securevoting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecureVotingDBConnection {
	Connection connection;

	public Connection getSecureVotingDatabase() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  connection = DriverManager.getConnection("jdbc:odbc:scv","scv","scv");
System.out.println("connection successfully created"+connection);
		} 
		catch (Exception e) 

		{
			connection=null;
			e.printStackTrace();
			System.out.println("Connection Not established");
		}
		/**catch (Exception e)
		{
		}
		System.out.println("hi");*/
		return connection;
	}
}
