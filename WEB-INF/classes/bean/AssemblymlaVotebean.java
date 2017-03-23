package com.securevoting.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.securevoting.SecureVotingDBConnection;

public class AssemblymlaVotebean {
	private String voterid;
	private String village;
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
	
	public boolean getUserDivision()
	{
		try
		{
		Connection connection =svDatabase.getSecureVotingDatabase();
		Statement statement = connection.createStatement();
		String uservillage = "select village from votingregistration where voterid='"+voterid+"'";

		ResultSet resultset=statement.executeQuery(uservillage);
		
		while(resultset.next()) 
			{
			div = resultset.getString("village"); 
			
			}
		//System.out.println("user division ================"+div);
		
		if(village.equals(div))
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
