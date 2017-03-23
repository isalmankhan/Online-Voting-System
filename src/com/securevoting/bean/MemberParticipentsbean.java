package com.securevoting.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import com.securevoting.SecureVotingDBConnection;

public class MemberParticipentsbean {
	private String mpperson1;
	private String mpplace1;
	private String mppost1;
	private String mppersondesc1;
	private String mpperson2;
	private String mpplace2;
	private String mppost2;
	private String mppersondesc2;
	private String mpperson3;
	private String mpplace3;
	private String mppost3;
	private String mppersondesc3;
	
	private String mlaperson1;
	private String mlaplace1;
	private String mlapost1;
	private String mlapersondesc1;
	private String mlaperson2;
	private String mlaplace2;
	private String mlapost2;
	private String mlapersondesc2;
	private String mlaperson3;
	private String mlaplace3;
	private String mlapost3;
	private String mlapersondesc3;
	private String mlaperson4;
	private String mlaplace4;
	private String mlapost4;
	private String mlapersondesc4;
	private String mlaperson5;
	private String mlaplace5;
	private String mlapost5;
	private String mlapersondesc5;
	private String mlaperson6;
	private String mlaplace6;
	private String mlapost6;
	private String mlapersondesc6;
	private String mlaperson7;
	private String mlaplace7;
	private String mlapost7;
	private String mlapersondesc7;
	private String mlaperson8;
	private String mlaplace8;
	private String mlapost8;
	private String mlapersondesc8;
	private String mlaperson9;
	private String mlaplace9;
	private String mlapost9;
	private String mlapersondesc9;
	private String mlaperson10;
	private String mlaplace10;
	private String mlapost10;
	private String mlapersondesc10;
	private String mlaperson11;
	private String mlaplace11;
	private String mlapost11;
	private String mlapersondesc11;
	private String mlaperson12;
	private String mlaplace12;
	private String mlapost12;
	private String mlapersondesc12;
	private String partyname;
	private String tablename;
	
	
	int i;
	int SNO;
	
	SecureVotingDBConnection svDatabase = new SecureVotingDBConnection();


	/*v.add(mpperson1);
	v.add(mpplace1);
	v.add(mppost1);
	v.add(mppersondesc1);
	*/

	/**
	 * @return the mpperson1
	 */
	public String getMpperson1() {
		return mpperson1;
	}
	/**
	 * @param mpperson1 the mpperson1 to set
	 */
	public void setMpperson1(String mpperson1) {
		this.mpperson1 = mpperson1;
	}
	/**
	 * @return the mpplace1
	 */
	public String getMpplace1() {
		return mpplace1;
	}
	/**
	 * @param mpplace1 the mpplace1 to set
	 */
	public void setMpplace1(String mpplace1) {
		this.mpplace1 = mpplace1;
	}
	/**
	 * @return the mppost1
	 */
	public String getMppost1() {
		return mppost1;
	}
	/**
	 * @param mppost1 the mppost1 to set
	 */
	public void setMppost1(String mppost1) {
		this.mppost1 = mppost1;
	}
	/**
	 * @return the mppersondesc1
	 */
	public String getMppersondesc1() {
		return mppersondesc1;
	}
	/**
	 * @param mppersondesc1 the mppersondesc1 to set
	 */
	public void setMppersondesc1(String mppersondesc1) {
		this.mppersondesc1 = mppersondesc1;
	}
	/**
	 * @return the mpperson2
	 */
	public String getMpperson2() {
		return mpperson2;
	}
	/**
	 * @param mpperson2 the mpperson2 to set
	 */
	public void setMpperson2(String mpperson2) {
		this.mpperson2 = mpperson2;
	}
	/**
	 * @return the mpplace2
	 */
	public String getMpplace2() {
		return mpplace2;
	}
	/**
	 * @param mpplace2 the mpplace2 to set
	 */
	public void setMpplace2(String mpplace2) {
		this.mpplace2 = mpplace2;
	}
	/**
	 * @return the mppost2
	 */
	public String getMppost2() {
		return mppost2;
	}
	/**
	 * @param mppost2 the mppost2 to set
	 */
	public void setMppost2(String mppost2) {
		this.mppost2 = mppost2;
	}
	/**
	 * @return the mppersondesc2
	 */
	public String getMppersondesc2() {
		return mppersondesc2;
	}
	/**
	 * @param mppersondesc2 the mppersondesc2 to set
	 */
	public void setMppersondesc2(String mppersondesc2) {
		this.mppersondesc2 = mppersondesc2;
	}
	/**
	 * @return the mpperson3
	 */
	public String getMpperson3() {
		return mpperson3;
	}
	/**
	 * @param mpperson3 the mpperson3 to set
	 */
	public void setMpperson3(String mpperson3) {
		this.mpperson3 = mpperson3;
	}
	/**
	 * @return the mpplace3
	 */
	public String getMpplace3() {
		return mpplace3;
	}
	/**
	 * @param mpplace3 the mpplace3 to set
	 */
	public void setMpplace3(String mpplace3) {
		this.mpplace3 = mpplace3;
	}
	/**
	 * @return the mppost3
	 */
	public String getMppost3() {
		return mppost3;
	}
	/**
	 * @param mppost3 the mppost3 to set
	 */
	public void setMppost3(String mppost3) {
		this.mppost3 = mppost3;
	}
	/**
	 * @return the mppersondesc3
	 */
	public String getMppersondesc3() {
		return mppersondesc3;
	}
	/**
	 * @param mppersondesc3 the mppersondesc3 to set
	 */
	public void setMppersondesc3(String mppersondesc3) {
		this.mppersondesc3 = mppersondesc3;
	}
	/**
	 * @return the mlaperson1
	 */
	public String getMlaperson1() {
		return mlaperson1;
	}
	/**
	 * @param mlaperson1 the mlaperson1 to set
	 */
	public void setMlaperson1(String mlaperson1) {
		this.mlaperson1 = mlaperson1;
	}
	/**
	 * @return the mlaplace1
	 */
	public String getMlaplace1() {
		return mlaplace1;
	}
	/**
	 * @param mlaplace1 the mlaplace1 to set
	 */
	public void setMlaplace1(String mlaplace1) {
		this.mlaplace1 = mlaplace1;
	}
	/**
	 * @return the mlapost1
	 */
	public String getMlapost1() {
		return mlapost1;
	}
	/**
	 * @param mlapost1 the mlapost1 to set
	 */
	public void setMlapost1(String mlapost1) {
		this.mlapost1 = mlapost1;
	}
	/**
	 * @return the mlapersondesc1
	 */
	public String getMlapersondesc1() {
		return mlapersondesc1;
	}
	/**
	 * @param mlapersondesc1 the mlapersondesc1 to set
	 */
	public void setMlapersondesc1(String mlapersondesc1) {
		this.mlapersondesc1 = mlapersondesc1;
	}
	/**
	 * @return the mlaperson2
	 */
	public String getMlaperson2() {
		return mlaperson2;
	}
	/**
	 * @param mlaperson2 the mlaperson2 to set
	 */
	public void setMlaperson2(String mlaperson2) {
		this.mlaperson2 = mlaperson2;
	}
	/**
	 * @return the mlaplace2
	 */
	public String getMlaplace2() {
		return mlaplace2;
	}
	/**
	 * @param mlaplace2 the mlaplace2 to set
	 */
	public void setMlaplace2(String mlaplace2) {
		this.mlaplace2 = mlaplace2;
	}
	/**
	 * @return the mlapost2
	 */
	public String getMlapost2() {
		return mlapost2;
	}
	/**
	 * @param mlapost2 the mlapost2 to set
	 */
	public void setMlapost2(String mlapost2) {
		this.mlapost2 = mlapost2;
	}
	/**
	 * @return the mlapersondesc2
	 */
	public String getMlapersondesc2() {
		return mlapersondesc2;
	}
	/**
	 * @param mlapersondesc2 the mlapersondesc2 to set
	 */
	public void setMlapersondesc2(String mlapersondesc2) {
		this.mlapersondesc2 = mlapersondesc2;
	}
	/**
	 * @return the mlaperson3
	 */
	public String getMlaperson3() {
		return mlaperson3;
	}
	/**
	 * @param mlaperson3 the mlaperson3 to set
	 */
	public void setMlaperson3(String mlaperson3) {
		this.mlaperson3 = mlaperson3;
	}
	/**
	 * @return the mlaplace3
	 */
	public String getMlaplace3() {
		return mlaplace3;
	}
	/**
	 * @param mlaplace3 the mlaplace3 to set
	 */
	public void setMlaplace3(String mlaplace3) {
		this.mlaplace3 = mlaplace3;
	}
	/**
	 * @return the mlapost3
	 */
	public String getMlapost3() {
		return mlapost3;
	}
	/**
	 * @param mlapost3 the mlapost3 to set
	 */
	public void setMlapost3(String mlapost3) {
		this.mlapost3 = mlapost3;
	}
	/**
	 * @return the mlapersondesc3
	 */
	public String getMlapersondesc3() {
		return mlapersondesc3;
	}
	/**
	 * @param mlapersondesc3 the mlapersondesc3 to set
	 */
	public void setMlapersondesc3(String mlapersondesc3) {
		this.mlapersondesc3 = mlapersondesc3;
	}
	/**
	 * @return the mlaperson4
	 */
	public String getMlaperson4() {
		return mlaperson4;
	}
	/**
	 * @param mlaperson4 the mlaperson4 to set
	 */
	public void setMlaperson4(String mlaperson4) {
		this.mlaperson4 = mlaperson4;
	}
	/**
	 * @return the mlaplace4
	 */
	public String getMlaplace4() {
		return mlaplace4;
	}
	/**
	 * @param mlaplace4 the mlaplace4 to set
	 */
	public void setMlaplace4(String mlaplace4) {
		this.mlaplace4 = mlaplace4;
	}
	/**
	 * @return the mlapost4
	 */
	public String getMlapost4() {
		return mlapost4;
	}
	/**
	 * @param mlapost4 the mlapost4 to set
	 */
	public void setMlapost4(String mlapost4) {
		this.mlapost4 = mlapost4;
	}
	/**
	 * @return the mlapersondesc4
	 */
	public String getMlapersondesc4() {
		return mlapersondesc4;
	}
	/**
	 * @param mlapersondesc4 the mlapersondesc4 to set
	 */
	public void setMlapersondesc4(String mlapersondesc4) {
		this.mlapersondesc4 = mlapersondesc4;
	}
	/**
	 * @return the mlaperson5
	 */
	public String getMlaperson5() {
		return mlaperson5;
	}
	/**
	 * @param mlaperson5 the mlaperson5 to set
	 */
	public void setMlaperson5(String mlaperson5) {
		this.mlaperson5 = mlaperson5;
	}
	/**
	 * @return the mlaplace5
	 */
	public String getMlaplace5() {
		return mlaplace5;
	}
	/**
	 * @param mlaplace5 the mlaplace5 to set
	 */
	public void setMlaplace5(String mlaplace5) {
		this.mlaplace5 = mlaplace5;
	}
	/**
	 * @return the mlapost5
	 */
	public String getMlapost5() {
		return mlapost5;
	}
	/**
	 * @param mlapost5 the mlapost5 to set
	 */
	public void setMlapost5(String mlapost5) {
		this.mlapost5 = mlapost5;
	}
	/**
	 * @return the mlapersondesc5
	 */
	public String getMlapersondesc5() {
		return mlapersondesc5;
	}
	/**
	 * @param mlapersondesc5 the mlapersondesc5 to set
	 */
	public void setMlapersondesc5(String mlapersondesc5) {
		this.mlapersondesc5 = mlapersondesc5;
	}
	/**
	 * @return the mlaperson6
	 */
	public String getMlaperson6() {
		return mlaperson6;
	}
	/**
	 * @param mlaperson6 the mlaperson6 to set
	 */
	public void setMlaperson6(String mlaperson6) {
		this.mlaperson6 = mlaperson6;
	}
	/**
	 * @return the mlaplace6
	 */
	public String getMlaplace6() {
		return mlaplace6;
	}
	/**
	 * @param mlaplace6 the mlaplace6 to set
	 */
	public void setMlaplace6(String mlaplace6) {
		this.mlaplace6 = mlaplace6;
	}
	/**
	 * @return the mlapost6
	 */
	public String getMlapost6() {
		return mlapost6;
	}
	/**
	 * @param mlapost6 the mlapost6 to set
	 */
	public void setMlapost6(String mlapost6) {
		this.mlapost6 = mlapost6;
	}
	/**
	 * @return the mlapersondesc6
	 */
	public String getMlapersondesc6() {
		return mlapersondesc6;
	}
	/**
	 * @param mlapersondesc6 the mlapersondesc6 to set
	 */
	public void setMlapersondesc6(String mlapersondesc6) {
		this.mlapersondesc6 = mlapersondesc6;
	}
	/**
	 * @return the mlaperson7
	 */
	public String getMlaperson7() {
		return mlaperson7;
	}
	/**
	 * @param mlaperson7 the mlaperson7 to set
	 */
	public void setMlaperson7(String mlaperson7) {
		this.mlaperson7 = mlaperson7;
	}
	/**
	 * @return the mlaplace7
	 */
	public String getMlaplace7() {
		return mlaplace7;
	}
	/**
	 * @param mlaplace7 the mlaplace7 to set
	 */
	public void setMlaplace7(String mlaplace7) {
		this.mlaplace7 = mlaplace7;
	}
	/**
	 * @return the mlapost7
	 */
	public String getMlapost7() {
		return mlapost7;
	}
	/**
	 * @param mlapost7 the mlapost7 to set
	 */
	public void setMlapost7(String mlapost7) {
		this.mlapost7 = mlapost7;
	}
	/**
	 * @return the mlapersondesc7
	 */
	public String getMlapersondesc7() {
		return mlapersondesc7;
	}
	/**
	 * @param mlapersondesc7 the mlapersondesc7 to set
	 */
	public void setMlapersondesc7(String mlapersondesc7) {
		this.mlapersondesc7 = mlapersondesc7;
	}
	/**
	 * @return the mlaperson8
	 */
	public String getMlaperson8() {
		return mlaperson8;
	}
	/**
	 * @param mlaperson8 the mlaperson8 to set
	 */
	public void setMlaperson8(String mlaperson8) {
		this.mlaperson8 = mlaperson8;
	}
	/**
	 * @return the mlaplace8
	 */
	public String getMlaplace8() {
		return mlaplace8;
	}
	/**
	 * @param mlaplace8 the mlaplace8 to set
	 */
	public void setMlaplace8(String mlaplace8) {
		this.mlaplace8 = mlaplace8;
	}
	/**
	 * @return the mlapost8
	 */
	public String getMlapost8() {
		return mlapost8;
	}
	/**
	 * @param mlapost8 the mlapost8 to set
	 */
	public void setMlapost8(String mlapost8) {
		this.mlapost8 = mlapost8;
	}
	/**
	 * @return the mlapersondesc8
	 */
	public String getMlapersondesc8() {
		return mlapersondesc8;
	}
	/**
	 * @param mlapersondesc8 the mlapersondesc8 to set
	 */
	public void setMlapersondesc8(String mlapersondesc8) {
		this.mlapersondesc8 = mlapersondesc8;
	}
	/**
	 * @return the mlaperson9
	 */
	public String getMlaperson9() {
		return mlaperson9;
	}
	/**
	 * @param mlaperson9 the mlaperson9 to set
	 */
	public void setMlaperson9(String mlaperson9) {
		this.mlaperson9 = mlaperson9;
	}
	/**
	 * @return the mlaplace9
	 */
	public String getMlaplace9() {
		return mlaplace9;
	}
	/**
	 * @param mlaplace9 the mlaplace9 to set
	 */
	public void setMlaplace9(String mlaplace9) {
		this.mlaplace9 = mlaplace9;
	}
	/**
	 * @return the mlapost9
	 */
	public String getMlapost9() {
		return mlapost9;
	}
	/**
	 * @param mlapost9 the mlapost9 to set
	 */
	public void setMlapost9(String mlapost9) {
		this.mlapost9 = mlapost9;
	}
	/**
	 * @return the mlapersondesc9
	 */
	public String getMlapersondesc9() {
		return mlapersondesc9;
	}
	/**
	 * @param mlapersondesc9 the mlapersondesc9 to set
	 */
	public void setMlapersondesc9(String mlapersondesc9) {
		this.mlapersondesc9 = mlapersondesc9;
	}
	/**
	 * @return the mlaperson10
	 */
	public String getMlaperson10() {
		return mlaperson10;
	}
	/**
	 * @param mlaperson10 the mlaperson10 to set
	 */
	public void setMlaperson10(String mlaperson10) {
		this.mlaperson10 = mlaperson10;
	}
	/**
	 * @return the mlaplace10
	 */
	public String getMlaplace10() {
		return mlaplace10;
	}
	/**
	 * @param mlaplace10 the mlaplace10 to set
	 */
	public void setMlaplace10(String mlaplace10) {
		this.mlaplace10 = mlaplace10;
	}
	/**
	 * @return the mlapost10
	 */
	public String getMlapost10() {
		return mlapost10;
	}
	/**
	 * @param mlapost10 the mlapost10 to set
	 */
	public void setMlapost10(String mlapost10) {
		this.mlapost10 = mlapost10;
	}
	/**
	 * @return the mlapersondesc10
	 */
	public String getMlapersondesc10() {
		return mlapersondesc10;
	}
	/**
	 * @param mlapersondesc10 the mlapersondesc10 to set
	 */
	public void setMlapersondesc10(String mlapersondesc10) {
		this.mlapersondesc10 = mlapersondesc10;
	}
	/**
	 * @return the mlaperson11
	 */
	public String getMlaperson11() {
		return mlaperson11;
	}
	/**
	 * @param mlaperson11 the mlaperson11 to set
	 */
	public void setMlaperson11(String mlaperson11) {
		this.mlaperson11 = mlaperson11;
	}
	/**
	 * @return the mlaplace11
	 */
	public String getMlaplace11() {
		return mlaplace11;
	}
	/**
	 * @param mlaplace11 the mlaplace11 to set
	 */
	public void setMlaplace11(String mlaplace11) {
		this.mlaplace11 = mlaplace11;
	}
	/**
	 * @return the mlapost11
	 */
	public String getMlapost11() {
		return mlapost11;
	}
	/**
	 * @param mlapost11 the mlapost11 to set
	 */
	public void setMlapost11(String mlapost11) {
		this.mlapost11 = mlapost11;
	}
	/**
	 * @return the mlapersondesc11
	 */
	public String getMlapersondesc11() {
		return mlapersondesc11;
	}
	/**
	 * @param mlapersondesc11 the mlapersondesc11 to set
	 */
	public void setMlapersondesc11(String mlapersondesc11) {
		this.mlapersondesc11 = mlapersondesc11;
	}
	/**
	 * @return the mlaperson12
	 */
	public String getMlaperson12() {
		return mlaperson12;
	}
	/**
	 * @param mlaperson12 the mlaperson12 to set
	 */
	public void setMlaperson12(String mlaperson12) {
		this.mlaperson12 = mlaperson12;
	}
	/**
	 * @return the mlaplace12
	 */
	public String getMlaplace12() {
		return mlaplace12;
	}
	/**
	 * @param mlaplace12 the mlaplace12 to set
	 */
	public void setMlaplace12(String mlaplace12) {
		this.mlaplace12 = mlaplace12;
	}
	/**
	 * @return the mlapost12
	 */
	public String getMlapost12() {
		return mlapost12;
	}
	/**
	 * @param mlapost12 the mlapost12 to set
	 */
	public void setMlapost12(String mlapost12) {
		this.mlapost12 = mlapost12;
	}
	/**
	 * @return the mlapersondesc12
	 */
	public String getMlapersondesc12() {
		return mlapersondesc12;
	}
	/**
	 * @param mlapersondesc12 the mlapersondesc12 to set
	 */
	public void setMlapersondesc12(String mlapersondesc12) {
		this.mlapersondesc12 = mlapersondesc12;
	}
	
	public int memberDate()
	{
		try
		{
			Vector v =new Vector();
			v.add(mpperson1);
			v.add(mppost1);
			v.add(mppersondesc1);
			v.add(mpplace1);
				
			v.add(mpperson2);
			v.add(mppost2);
			v.add(mppersondesc2);
			v.add(mpplace2);
			
			v.add(mpperson3);
			v.add(mppost3);
			v.add(mppersondesc3);
			v.add(mpplace3); 
			
			v.add(mlaperson1);
			v.add(mlapost1);
			v.add(mlapersondesc1);
			v.add(mlaplace1);
			
			v.add(mlaperson2);
			v.add(mlapost2);
			v.add(mlapersondesc2);
			v.add(mlaplace2);
			
			v.add(mlaperson3);
			v.add(mlapost3);
			v.add(mlapersondesc3);
			v.add(mlaplace3);
			
			v.add(mlaperson4);
			v.add(mlapost4);
			v.add(mlapersondesc4);
			v.add(mlaplace4);
			
			v.add(mlaperson5);
			v.add(mlapost5);
			v.add(mlapersondesc5);
			v.add(mlaplace5);
			
			v.add(mlaperson6);
			v.add(mlapost6);
			v.add(mlapersondesc6);
			v.add(mlaplace6);
			
			v.add(mlaperson7);
			v.add(mlapost7);
			v.add(mlapersondesc7);
			v.add(mlaplace7);
			
			v.add(mlaperson8);
			v.add(mlapost8);
			v.add(mlapersondesc8);
			v.add(mlaplace8);
			
			v.add(mlaperson9);
			v.add(mlapost9);
			v.add(mlapersondesc9);
			v.add(mlaplace9);
			
			v.add(mlaperson10);
			v.add(mlapost10);
			v.add(mlapersondesc10);
			v.add(mlaplace10);
			
			v.add(mlaperson11);
			v.add(mlapost11);
			v.add(mlapersondesc11);
			v.add(mlaplace11);
			
			v.add(mlaperson12);
			v.add(mlapost12);
			v.add(mlapersondesc12);
			v.add(mlaplace12);
			
			int z=1;
			int j=0;
			int k=1;
			int l=2;
			int m=3;
			
			//System.out.println("data is add to the vector object");
			
		Connection connection =svDatabase.getSecureVotingDatabase();
		Statement statement = connection.createStatement();
		tablename  = partyname+"participents";
		System.out.println("table name is --->"+tablename);
		String sno = "select max(sno) from "+tablename+" ";
		ResultSet rs = statement.executeQuery(sno);
		while(rs.next())
		{
			SNO = rs.getInt("max(sno)");
			//System.out.println("max serial no is--->"+SNO);
			SNO=SNO+1;
			//System.out.println("incremented serial no is--->"+SNO);
		}
		while(z<=15)
		{
		String memberrecord = "insert into "+tablename+" values("+SNO+",'"+(String)v.get(j)+"','"+partyname+"','"+(String)v.get(k)+"','"+(String)v.get(l)+"','"+(String)v.get(m)+"')";
	//	System.out.println("member record is ================"+memberrecord);
		i = statement.executeUpdate(memberrecord);
		j=j+4;
		k=k+4;
		l=l+4;
		m=m+4;
		z++;
		SNO++;
		//System.out.println("the sno is----------------------->"+SNO);
		}
		
		if(i==1)
		{
			
		}
		}
		catch(Exception e){
			System.out.println("exception is due to---->"+e);
		}
		return i;
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
}
