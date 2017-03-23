package com.securevoting.bean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.securevoting.SecureVotingDBConnection;

public class LoginBean {

	private String nssn;
	private String voteid;
	private boolean b;
	
	SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();
	public String getNssn() {
		return nssn;
	}
	public void setNssn(String nssn) {
		this.nssn = nssn;
	}
	public String getVoteid() {
		return voteid;
	}
	public void setVoteid(String voteid) {
		this.voteid = voteid;
	}
	String voterid1=null;
	String nssn1=null;
	public boolean validateLogin()
	{
		try
		{
		Connection connection =svDatabase.getSecureVotingDatabase();
		Statement statement = connection.createStatement();
		String loginquery="select nssn,voterid from votingregistration where nssn='"+nssn+"' and voterid='"+voteid+"'";
		
		ResultSet resultset=statement.executeQuery(loginquery);
		
		while(resultset.next()) 
			{
			
			nssn1= resultset.getString("nssn"); 
			
			voterid1=resultset.getString("voterid");
			
			}
		if(nssn1.equals(nssn) && voterid1.equals(voteid))
		{
			//System.out.println("success ");
			b=true;
		}
		else
		{
			//System.out.println("failed");
			b=false;
		}
		}
		catch ( SQLException e)
		{
			System.out.println("exception is due to "+e);
		}
		
		return b;	
	}
}
