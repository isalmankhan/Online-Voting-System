package com.securevoting.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.securevoting.SecureVotingDBConnection;

public class ParlamentmpVotebean {
	private String voterid;
	private String division;
	String div;
	boolean b;
	SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();
	
	/**
	 * @return the voterid
	 */
	public String getVoterid() {
		return voterid;
	}
	/**
	 * @param voterid the voterid to set
	 */
	public void setVoterid(String voterid) {
		this.voterid = voterid;
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
	
	public boolean getUserDivision()
	{
		try
		{
		Connection connection =svDatabase.getSecureVotingDatabase();
		Statement statement = connection.createStatement();
		String userdivision = "select division from votingregistration where voterid='"+voterid+"'";

		ResultSet resultset=statement.executeQuery(userdivision);
		
		while(resultset.next()) 
			{
			div = resultset.getString("division"); 
			
			}
		//System.out.println("user division ================"+div);
		
		if(division.equals(div))
		{
			b=true;
		 
		}
		else
		{
			b=false;
		}
		}
		catch(Exception e){
			System.out.println("exception is due to---->"+e);
		}
		return b;
	}
	}


