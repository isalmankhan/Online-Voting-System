<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.Vector"%>
<jsp:useBean id="dbconnection" class="com.securevoting.SecureVotingDBConnection" scope="session"/>
<%!
String congmpname;
String party1;
String tdpmpname;
String party2;
String trsmpname;
String party3;
String bjpmpname;
String party4;
String RudhraNethrampname;
String party5;
String Othersmpname;
String party6;
%>

<%
String division = (String)session.getAttribute("division");
String cong = "select name,party from congressMP where participatingplace='"+division+"' ";
String tdp = "select name,party from tdpMP where participatingplace='"+division+"' ";
String trs = "select name,party from trsMP where participatingplace='"+division+"' ";
String bjp = "select name,party from bjpMP where participatingplace='"+division+"' ";
String RudhraNethra = "select name,party from RudhraNethraMP where participatingplace='"+division+"' ";
String Others = "select name,party from OtherMP where participatingplace='"+division+"' ";
Connection con = dbconnection.getSecureVotingDatabase();
Statement stmt = con.createStatement();

ResultSet rs1 = stmt.executeQuery(cong);
while(rs1.next())
{
congmpname = rs1.getString("name");
party1 = rs1.getString("party");
}

ResultSet rs2 = stmt.executeQuery(tdp);
while(rs2.next())
{
tdpmpname = rs2.getString("name");
party2 = rs2.getString("party");
}

ResultSet rs3 = stmt.executeQuery(trs);
while(rs3.next())
{
trsmpname = rs3.getString("name");
party3 = rs3.getString("party");
}

ResultSet rs4 = stmt.executeQuery(bjp);
while(rs4.next())
{
bjpmpname = rs4.getString("name");
party4 = rs4.getString("party");
}

ResultSet rs5 = stmt.executeQuery(RudhraNethra);
while(rs5.next())
{
RudhraNethrampname = rs5.getString("name");
party5 = rs5.getString("party");
}

ResultSet rs6 = stmt.executeQuery(Others);
while(rs6.next())
{
Othersmpname = rs6.getString("name");
party6 = rs6.getString("party");
}
%>

<html>
  <head>
    
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <BODY bgcolor="#A3ADAO">
<form action="./voteforMP" method="post">		
			<table border ="2" bordercolor="green" width="80%" height="10%">
  
  <tr>
  <th align="left" width="50%" height="20%"><font size="7" color="#BF044A"><i>S</font><font color="#BF044A">ecure</font><font size="7" color="#BF044A">V</font><font color="#BF044A">oting</i>&nbsp;&nbsp;&nbsp;<a href="./html/Home.html">home</a></font></th>
  
<td width="30%">
 <img width="300" border="3" bordercolor="yellow" height="200" src=".\images\flag.gif"></img>
</td>
			</table> 
   <table width="100%" border="0" align="center">
<tbody>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<BR><BR>
<B>SELECT THE PARTY YOU WANT TO VOTE FOR MP POST</B>

<tr><td align="center"><input type="radio" name="mp" value="<%=congmpname%>,<%=party1%>"></Td><Td><font size="4"><%=congmpname%></font></Td><td><font size="4"><%=party1%></font></td></tr>
<tr><th align="center"><input type="radio" name="mp" value="<%=tdpmpname%>,<%=party2%>"></th><td><font size="4"><%=tdpmpname%></font></td><td><font size="4"><%=party2%></font></td></tr>
<tr><th align="center"><input type="radio" name="mp" value="<%=trsmpname%>,<%=party3%>"></th><td><font size="4"><%=trsmpname%></font></td><td><font size="4"><%=party3%></font></td></tr>
<tr><th align="center"><input type="radio" name="mp" value="<%=bjpmpname%>,<%=party4%>"></th><td><font size="4"><%=bjpmpname%></font></td><td><font size="4"><%=party4%></font></td></tr>
<tr><th align="center"><input type="radio" name="mp" value="<%=RudhraNethrampname%>,<%=party5%>"></th><td><font size="4"><%=RudhraNethrampname%></font></td><td><font size="4"><%=party5%></font></td></tr>
<tr><th align="center"><input type="radio" name="mp" value="<%=Othersmpname%>,<%=party6%>"></th><td><font size="4"><%=Othersmpname%></font></td><td><font size="4"><%=party6%></font></td></tr>

</tbody>
</table>
<br><br><br><blockquote><blockquote><blockquote><blockquote>
<input type="submit" value="submit"/></blockquote></blockquote></blockquote></blockquote>
</form>
  </body>
</html>
