package com.securevoting.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.securevoting.SecureVotingDBConnection;

public class AdminLoginbean {
private String username;
private String password;
   String uname;
   String pwd;
   boolean b;
/**
 * @return the username
 */

SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}

public boolean validateLogin()
{
	try
	{
	Connection connection =svDatabase.getSecureVotingDatabase();
	Statement statement = connection.createStatement();
	String loginquery="select username,password from admin where username='"+username+"' and password='"+password+"'";
	ResultSet resultset=statement.executeQuery(loginquery);
	
	while(resultset.next()) 
		{
	    uname= resultset.getString("username"); 
		pwd=resultset.getString("password");
		//System.out.println("nsss ================"+uname);
		//System.out.println("voterid ================"+pwd);
		}
	if(username.equals(uname) && password.equals(pwd))
	{
		//System.out.println("success");
		b=true;
	}
	else
	{
		//System.out.println("failed");
		b=false;
	}
	}
	catch (SQLException e)
	{
		System.out.println("exception is due to "+e);
	}
	
	return b;	
}

}
