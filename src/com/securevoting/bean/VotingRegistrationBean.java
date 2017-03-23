package com.securevoting.bean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.securevoting.SecureVotingDBConnection;


public class VotingRegistrationBean {
	private String nssn;
	private String fname;
	private String lname;
	private String day;
	private String month;
	private String year;
	private String voteid;
	private String division;
	private String village;
	private String voteID;
	private int VOTEID;
	private String country="INDHYD";
	  int i;
	  String nssn1;
	  SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	 
 public int validateVoting()
 {
		  try
		  {
			  
			String date =day+"-"+month+"-"+year; 
			
			
			Connection connection =  svDatabase.getSecureVotingDatabase();
			Statement statement = connection.createStatement();
			String voteid = "select max(VOTERID) from votingregistration";
			String dob = "select dob from nssnregistration where nssn='"+nssn+"'";
		  Connection connection1 =  svDatabase.getSecureVotingDatabase();
		  Statement statement1 = connection1.createStatement();
		  ResultSet vote = statement1.executeQuery(voteid);
		
		  while(vote.next())
		  {
			  voteID = vote.getString("MAX(VOTERID)");
			
		  }
		  VOTEID = Integer.parseInt(voteID.substring(6));
		 
		  VOTEID = VOTEID+1;
		  voteID = country+VOTEID;
		  
		  
		  System.out.println("voter id is***00000000000000000000***8--->"+voteID); 
		  
		 
		  /*ResultSet nssnid = statement1.executeQuery(dob);
		  while(nssnid.next())
		  {
		 	nssn1 = nssnid.getString("dob");
		 	System.out.println("date of birth from nssnreg table is=========>"+nssn1);
		 	System.out.println("date of birth from votepage table is=========>"+date);
		 	String a=getNssn();
		 	//System.out.println("nssn aa from user is==========>"+a);
		 	
		 	String insert ="insert into votingregistration values('"+nssn+"','"+voteID+"','"+fname+"','"+lname+"','"+date+"','"+division+"','"+village+"')";
		 	System.out.println("the insert statement is=========>"+insert);
		 	if(date.equals("05-May-1984"))
		 	{
		 		//System.out.println("both are equal");
		 		i = statement.executeUpdate(insert);
		 	}
		 	else
		 	{
		 		System.out.println("your date of birth in nssn is not matched with the current date of birth");
		 		i=0;
		 	}
				 
		  }*/
		  String insert ="insert into votingregistration values('"+nssn+"','"+voteID+"','"+fname+"','"+lname+"','"+date+"','"+division+"','"+village+"')";
		 	System.out.println("the insert statement is=========>"+insert);
		 	i = statement.executeUpdate(insert);
		  }
		  catch( SQLException e )
		  {
		  System.out.println("failed to inserted db "+e);
		  }
	
	  
	  return i;

 }
/**
 * @return the voteid
 */
public String getVoteid() {
	return voteid;
}
/**
 * @param voteid the voteid to set
 */
public void setVoteid(String voteid) {
	this.voteid = voteid;
}
/**
 * @return the nssn
 */
public String getNssn() {
	return nssn;
}
/**
 * @param nssn the nssn to set
 */
public void setNssn(String nssn) {
	this.nssn = nssn;
}
/**
 * @return the division
 */
public String getDivision() {
	return division;
}
/**
 * @param division the division to set
 */
public void setDivision(String division) {
	this.division = division;
}
/**
 * @return the vOTEID
 */
public int getVOTEID() {
	return VOTEID;
}
/**
 * @param voteid the vOTEID to set
 */
public void setVOTEID(int voteid) {
	VOTEID = voteid;
}
/**
 * @return the voteID
 */
public String getVoteID() {
	return voteID;
}
/**
 * @param voteID the voteID to set
 */
public void setVoteID(String voteID) {
	this.voteID = voteID;
}
/**
 * @return the village
 */
public String getVillage() {
	return village;
}
/**
 * @param village the village to set
 */
public void setVillage(String village) {
	this.village = village;
}
 
 }

