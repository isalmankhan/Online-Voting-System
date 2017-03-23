package com.securevoting.bean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import com.securevoting.SecureVotingDBConnection;


public class NssnRegistrationBean {
  String fname;
  String lname;
  String day;
  String month;
  String year;
  String nationality;
  String others;
  String gender;
  String gname;
  String state;
  String distict;
  String mandal;
  String village;
  String  hno;
  String nssn;
  String country = "INDAPHYD";
  int i;
 
  
  SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();
/**
 * @return the fname
 */
public String getFname() {
	return fname;
}
/**
 * @param fname the fname to set
 */
public void setFname(String fname) {
	this.fname = fname;
}
/**
 * @return the lname
 */
public String getLname() {
	return lname;
}
/**
 * @param lname the lname to set
 */
public void setLname(String lname) {
	this.lname = lname;
}
/**
 * @return the gname
 */
public String getGname() {
	return gname;
}
/**
 * @param gname the gname to set
 */
public void setGname(String gname) {
	this.gname = gname;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return the day
 */
public String getDay() {
	return day;
}
/**
 * @param day the day to set
 */
public void setDay(String day) {
	this.day = day;
}
/**
 * @return the month
 */
public String getMonth() {
	return month;
}
/**
 * @param month the month to set
 */
public void setMonth(String month) {
	this.month = month;
}
/**
 * @return the year
 */
public String getYear() {
	return year;
}
/**
 * @param year the year to set
 */
public void setYear(String year) {
	this.year = year;
}
/**
 * @return the nationality
 */
public String getNationality() {
	return nationality;
}
/**
 * @param nationality the nationality to set
 */
public void setNationality(String nationality) {
	this.nationality = nationality;
}
/**
 * @return the others
 */
public String getOthers() {
	return others;
}
/**
 * @param others the others to set
 */
public void setOthers(String others) {
	this.others = others;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the distict
 */
public String getDistict() {
	return distict;
}
/**
 * @param distict the distict to set
 */
public void setDistict(String distict) {
	this.distict = distict;
}
/**
 * @return the mandal
 */
public String getMandal() {
	return mandal;
}
/**
 * @param mandal the mandal to set
 */
public void setMandal(String mandal) {
	this.mandal = mandal;
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
/**
 * @return the hno
 */
public String getHno() {
	return hno;
}
/**
 * @param hno the hno to set
 */
public void setHno(String hno) {
	this.hno = hno;
}
  
  public int validatenssn()
  {
	 try
	  {	
		 System.out.println(this.getOthers());
		String date = day+"-"+ month+"-"+ year;
		
		int nssnID = 0;
		String nssnid = "select nssn from nssnregistration";
		
		Connection connection =  svDatabase.getSecureVotingDatabase();
		  Statement statement = connection.createStatement();
		  
		  ResultSet rs = statement.executeQuery(nssnid);
		  while(rs.next())
		  {
			  nssn = rs.getString("nssn");
			  nssnID = Integer.parseInt(nssn.substring(8));
			  System.out.println("nssn id ");
			  nssnID = nssnID+1;
			  nssn = country+nssnID;
		  }
		  //System.out.println("nssn id is---->"+nssn);
		
		 String insert =" insert into nssnregistration values ('"+nssn+"','"+fname+"','"+lname+"','"+date+ 
		 "','"+nationality+"','"+gender+"','"+gname+"','"+state+"','"+distict+" ','"+ 
		 mandal+" ','"+village+"','"+hno+"')";
		
		 
		 
		  
	 String insert1 ="insert into nssnregistration values ('"+nssn+"','"+fname+"','"+lname+"','"+date+ 
		 "','"+others+"','"+gender+"','"+gname+"','"+state+"','"+distict +" ','"+
		 mandal+" ','"+village+"','"+hno+"')";
		
	if(nationality.equals("others"))
		 {
			//System.out.println("natinality others");
			 if(others.equalsIgnoreCase("graterthan17"))
			 {
				 //System.out.println("graterthan17");
				// System.out.println(insert1);
				 i = statement.executeUpdate(insert1);
			 }
			 else
			 {
				 //System.out.println("lessthan17");
				 i=0;
				 
			 }
		 }
		 else
		 {
			 //System.out.println("nationality indian");
		 //System.out.println(insert);
		 i = statement.executeUpdate(insert);
		 }
		 if(i==1)
		 {
			// System.out.println("values are successfully inserted ");
		 }
		 
	  }
	  catch( SQLException e )
	  {
		  System.out.println(e);
	  }
	  
	  
	  return i;
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
  
  }

