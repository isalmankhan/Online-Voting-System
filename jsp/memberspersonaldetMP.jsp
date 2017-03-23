<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.Vector"%>
<jsp:useBean id="dbconnection" class="com.securevoting.SecureVotingDBConnection" scope="session"/>
<%!
String persondetails;
String tablename;
String partyname;
String personname;
String nameofperson;
String participentstable;
Connection con;
Statement stmt;
ResultSet rs;
ResultSet rs1;
%>
<%
int k = Integer.parseInt(request.getParameter("k"));
System.out.println("variable from javascript ----->"+k);

partyname = (String)session.getAttribute("party_name");
System.out.println("8888888888888 ----->"+partyname);

participentstable = partyname+"participents";
System.out.println("T777777777777777----->"+participentstable);
personname = "select persion from "+participentstable+" where sno="+k+" "; 
con = dbconnection.getSecureVotingDatabase();
stmt = con.createStatement();
rs = stmt.executeQuery(personname);
while(rs.next())
{
nameofperson = rs.getString("persion");
System.out.println("person name is----->"+nameofperson);
}

tablename = partyname+"mp"; 
persondetails = "select * from congressmp where name='"+nameofperson+"'";
rs1 = stmt.executeQuery(persondetails);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'memberspersonaldet.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language="javaScript">

function winclose()
{
window.close();

}
</script>
  </head>
  
  <BODY bgcolor="#A3ADAO">
		
			<table border ="2" bordercolor="green" width="80%" height="10%">
  
  <tr>
  <th align="left" width="50%" height="20%"><font size="7" color="#BF044A"><i>S</font><font color="#BF044A">ecure</font><font size="7" color="#BF044A">V</font><font color="#BF044A">oting</i>&nbsp;&nbsp;&nbsp;<a href="../html/Home.html">home</a></font></th>
  
<td width="30%">
 <img width="300" border="3" bordercolor="yellow" height="200" src="..\images\flag.gif"></img>
</td>
			</table> 
    <table width="100%" border="0">
<tbody><br><br>
<tr><th width="100%" align=left><B><%=partyname%> Party Member</B></th></tr>
<tr><td>&nbsp;</td></tr>

<tr><td>&nbsp;</td></tr>
</tbody>
</table>
<table border="3" width="100%" #453446>
<tr>
<td><font size="4">NAME</font></td>
<td><font size="4">AGE</font></td>
<td><font size="4">BIRTH PLACE</font></td>
<td><font size="4">PARTICIPATING PLACE</font></td>
<td><font size="4">EDUCATIONAL BACKGROUND</font></td>
<td><font size="4">PROPERTY VALUE</font></td>
<td><font size="4">POLICE RECORD</font></td>
</tr>
<%
while(rs1.next())
{
 %>
<tr>
<td><%=rs1.getString("name")%></td>
<td><%=rs1.getInt("age")%></td>
<td><%=rs1.getString("birthplace")%></td>
<td><%=rs1.getString("participatingplace")%></td>
<td><%=rs1.getString("educationalbg")%></td>
<td><%=rs1.getString("propertyvalue")%></td>
<td><%=rs1.getString("policerecord")%></td>
</tr>
<%
}
%>
</table> 
<br><br>
<center>
<input type="submit" value="CLOSE" onclick='winclose()'></center>
 </body>
</html>
