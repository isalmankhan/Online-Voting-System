<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<jsp:useBean id="dbconn" class="com.securevoting.SecureVotingDBConnection" scope="session"/>
<%
String partynames = "select partyname from party";
Connection con = dbconn.getSecureVotingDatabase();
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(partynames);
%>
<html>
  <head>
    <title>memberdesc.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <BODY bgcolor="#A3ADAO">
		
			<table border ="2" bordercolor="green" width="80%" height="10%">
  
  <tr>
  <th align="left" width="50%" height="20%"><font size="7" color="#BF044A"><i>S</font><font color="#BF044A">ecure</font><font size="7" color="#BF044A">V</font><font color="#BF044A">oting</i>&nbsp;&nbsp;&nbsp;<a href="../html/Home.html">home</a></font></th>
  
<td width="30%">
 <img width="300" border="3" bordercolor="yellow" height="200" src="..\images\flag.gif"></img>
</td>
			</table>
  <form action="../jsp/memberdescpost.jsp" >
  <table width="300" border="0" align="center">
<tbody>
<tr>
<th>&nbsp;</th>
</tr>
<tr>
<th>&nbsp;</th>
</tr>
<tr>
<th>&nbsp;</th>
</tr>
<tr>
<th>Party name</th>
<td>&nbsp;<select name="partyname">
<%while(rs.next())
{
%>
<option><%=rs.getString("partyname")%></option>
<%
}
%>
</select></td></tr>
<tr><th>&nbsp;</th><td align="left"><input type="submit" name="submit" value="submit"></td></tr>
</tbody></table>
</form>
  </body>
</html>
