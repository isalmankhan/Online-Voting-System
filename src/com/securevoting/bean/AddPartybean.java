package com.securevoting.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.securevoting.SecureVotingDBConnection;

public class AddPartybean {
private String partyname;
 int psno;
 int i;
SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();



public String getPartyname() {
	return partyname;
}
/**
 * @param partyname the partyname to set
 */
public void setPartyname(String partyname) {
	this.partyname = partyname;
}

public int addParty()
{
	try
	{
	Connection connection =svDatabase.getSecureVotingDatabase();
	Statement statement = connection.createStatement();
		String partysno = "select max(sno) from party";
		
	String createparty = "create table "+partyname+"participents(sno number(10) unique not null," +
			"persion varchar2(30) not null,party varchar2(30) not null,post varchar2(10) not null," +
			"persiondesc varchar2(40) not null,place  varchar2(30) constraint "+partyname+"participate_place_pk primary key)";
	//System.out.println("query is----------->"+createparty);
	int q = statement.executeUpdate(createparty);
	
	String partydata = "Insert into "+partyname+"participents values(0,'xxx','yyy','zzz','aaa','bbb')";
	int p = statement.executeUpdate(partydata);
	
	String mpparty = "create table "+partyname+"MP(sno number(10) unique not null," +
			"party varchar2(30) not null,post varchar2(5) not null,name varchar2(30) not null," +
			"age number(10) not null,birthplace varchar2(30) not null,participatingplace varchar2(30) not null," +
			"educationalbg varchar2(30) not null,propertyvalue number(20) not null," +
			"policerecord varchar2(10) not null,constraint "+partyname+"mp_participatingplace_fk " +
					"foreign key(participatingplace) references "+partyname+"participents(place))";
	//System.out.println("query is----------->"+mpparty);
	int j = statement.executeUpdate(mpparty);
	String mpdata = "insert into "+partyname+"mp values(0,'ee','a','xxx',43,'yyy','bbb','B.E',2323,'no')";
	int k = statement.executeUpdate(mpdata);
	
	String mlaparty = "create table "+partyname+"mla(sno number(10) unique not null," +
			"party varchar2(30) not null,post varchar2(5) not null, name varchar2(30) not null," +
			"age number(10) not null, birthplace varchar2(30) not null,participatingplace varchar2(30) not null," +
			"educationalbg varchar2(30) not null, propertyvalue number(20) not null," +
			"policerecord varchar2(10) not null,constraint "+partyname+"mla_participatingplace_fk" +
					" foreign key(participatingplace) references "+partyname+"participents(place))";
	//System.out.println("query is----------->"+mlaparty);
	int l = statement.executeUpdate(mlaparty);
	
	String mladata = "insert into "+partyname+"mla values(0,'ee','a','xxx',43,'yyy','bbb','B.E',2323,'no')";
	int m = statement.executeUpdate(mladata);
	
	ResultSet resultset=statement.executeQuery(partysno);
	while(resultset.next()) 
		{
		psno = resultset.getInt("max(sno)"); 
		psno = psno+1;
		}
	//System.out.println("party sno ================"+psno);
	String partyquery="insert into party values("+psno+",'"+partyname+"')";
	 i = statement.executeUpdate(partyquery);
	 //System.out.println("i value ================"+i);
	}
	catch(Exception e){
		System.out.println("exception is due to---->"+e);
	}
	return i;
}
}
