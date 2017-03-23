<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.TreeSet"%>
<jsp:useBean id="dbconnection" class="com.securevoting.SecureVotingDBConnection" scope="session"/>
<%!
String party;
int i;
String tablename;
String persondescription;
Connection con;
Statement stmt;
ResultSet rs;
String person;
String place;
String persondesc;
String sno;
ResultSet rs1;
Vector v1;
%>
<%
con = dbconnection.getSecureVotingDatabase();
stmt = con.createStatement();
party = (String)session.getAttribute("party_name");
System.out.println("party name is ----->"+party);
tablename=party+"participents";
System.out.println("TABLE name is ----->"+tablename);
sno = "select sno from "+tablename+" where post='MP'";
rs1 = stmt.executeQuery(sno);
v1 = new Vector();
while(rs1.next())
{
v1.add(new Integer(rs1.getInt("sno")));
}
//Vector v1 = new Vector(ts);
persondescription = "select * from "+tablename+" where post='MP' ";

rs=stmt.executeQuery(persondescription);
%>

<html>
  <head>
    <title>partypurpose.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

<SCRIPT LANGUAGE="JavaScript">
  function go(k)
   {
   window.alert("you have selected option"+k);
   var i=k;
   
   window.open("./memberspersonaldetMP.jsp?k="+i);
   }
  </script>

  </head>
  
  <BODY bgcolor="#A3ADAO">
		<table  width="100%">
		<tr>
		<th width="80%" align="left">
			<table border ="2" bordercolor="green" width="100%" height="10%">
  
  <tr>
  <th align="left" width="50%" height="20%"><font size="7" color="#BF044A"><i>S</font><font color="#BF044A">ecure</font><font size="7" color="#BF044A">V</font><font color="#BF044A">oting</i>&nbsp;&nbsp;&nbsp;<a href="../html/Home.html">home</a></font></th>
  
<td width="30%">
 <img width="300" border="3" bordercolor="yellow" height="200" src="..\images\flag.gif"></img>
</td>
			</table> </th>
			<%
			if(party.equals("Congress"))
			{
				%>
			<th align="center" width="20%">
<img src="../images\congsymbol.gif" border=3/>
</th>
<%
		}
				else if(party.equals("TDP"))
			{
				%>
			<th align="center" width="20%">
<img src="../images\tdp.gif" border=3/>
</th>
<%
		}
					else if(party.equals("BJP"))
			{
				%>
			<th align="center" width="20%">
<img src="../images\bjpsymbol.gif" border=3/>
</th>
<%
		}
%>
</th>
</table><br><br><br>
    <table width="200" border="3" bordercolor="green" align="center" cellpadding="5" cellspacing="8">
<tbody>



<tr>

<td align="center"><font size="4" >PERSON</font></td>
<td align="center"><font size="4">PLACE</font></td>
<td align="center"><font size="4">PERSONDESC </font></td></tr>
<%
int i=0;
while(rs.next())
{
%>
<tr align="left">

<td  ><a href="./membersofMP.jsp" onclick='go(<%=v1.get(i)%>)'><%=rs.getString("persion")%></a></td>
<td><%=rs.getString("place")%></td>
<td><%=rs.getString("persiondesc")%></td></tr>
<%
i++;
}
 %>
</tbody>
</table> 
  </body>
</html>
