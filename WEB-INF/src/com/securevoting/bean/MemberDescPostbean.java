package com.securevoting.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.securevoting.SecureVotingDBConnection;

public class MemberDescPostbean {
	private String post;
	private String name;
	private String age;
	private String birthplace;
	private String participatingplace;
	private String eduction;
	private String propertyvalue;
	private String policerecord;
	private String partyname;
	private String tablename;
	int i;
	private int SNO;
	 	
	SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();
	
	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the birthplace
	 */
	public String getBirthplace() {
		return birthplace;
	}
	/**
	 * @param birthplace the birthplace to set
	 */
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	/**
	 * @return the participatingplace
	 */
	public String getParticipatingplace() {
		return participatingplace;
	}
	/**
	 * @param participatingplace the participatingplace to set
	 */
	public void setParticipatingplace(String participatingplace) {
		this.participatingplace = participatingplace;
	}
	/**
	 * @return the eduction
	 */
	public String getEduction() {
		return eduction;
	}
	/**
	 * @param eduction the eduction to set
	 */
	public void setEduction(String eduction) {
		this.eduction = eduction;
	}
	/**
	 * @return the propertyvalue
	 */
	public String getPropertyvalue() {
		return propertyvalue;
	}
	/**
	 * @param propertyvalue the propertyvalue to set
	 */
	public void setPropertyvalue(String propertyvalue) {
		this.propertyvalue = propertyvalue;
	}
	/**
	 * @return the policerecord
	 */
	public String getPolicerecord() {
		return policerecord;
	}
	/**
	 * @param policerecord the policerecord to set
	 */
	public void setPolicerecord(String policerecord) {
		this.policerecord = policerecord;
	}
	
	/**
	 * @return the partyname
	 */
	public String getPartyname() {
		return partyname;
	}
	/**
	 * @param partyname the partyname to set
	 */
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	
	public int memberData()
	{
		try
		{
		Connection connection =svDatabase.getSecureVotingDatabase();
		Statement statement = connection.createStatement();
	    tablename = partyname+post;

	    String sno = "select max(sno) from "+tablename+" ";
		ResultSet rs = statement.executeQuery(sno);
		while(rs.next())
		{
			SNO = rs.getInt("max(sno)");
			//System.out.println("max serial no is--->"+SNO);
			SNO=SNO+1;
			//System.out.println("incremented serial no is--->"+SNO);
		}

		System.out.println("tablename----->"+tablename);
		System.out.println("partyname--->"+partyname);
		System.out.println("post"+post);
		String memberrecord = "insert into "+tablename+" values("+SNO+",'"+partyname+"','"+post+"','"+name+"','"+age+"'," +
				"'"+birthplace+"','"+participatingplace+"','"+eduction+"','"+propertyvalue+"','"+policerecord+"')";

		i = statement.executeUpdate(memberrecord);
		//System.out.println("member record is ================"+memberrecord);
		}
		catch(Exception e){
			System.out.println("exception is due to---->"+e);
		}
		return i;
	}
	

}
