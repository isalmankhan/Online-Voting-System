<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<jsp:useBean id="dbconnection" class="com.securevoting.SecureVotingDBConnection" scope="session"/>
<%!
String party;
int i;
String partyname;
Connection con;
Statement stmt;
ResultSet rs;
%>

<%
i = Integer.parseInt(request.getParameter("k"));

partyname = "select partyname from party where sno="+i+" ";
con = dbconnection.getSecureVotingDatabase();
stmt = con.createStatement();
rs = stmt.executeQuery(partyname);

while(rs.next())
{
party = rs.getString("partyname");
}

session.setAttribute("party_name",party);

%>

<html>
  <head>
    <title>Agenda.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
 <BODY bgcolor="#A3ADAO">
		
			<table border ="2" bordercolor="green" width="90%" height="10%">
  
  <tr>
  <th align="left" width="50%" height="20%"><font size="7" color="#BF044A"><i>S</font><font color="#BF044A">ecure</font><font size="7" color="#BF044A">V</font><font color="#BF044A">oting</i>&nbsp;&nbsp;&nbsp;<a href="./html/Home.html">home</a></font></th>
  
<td width="30%" align="right">
 <img width="300" border="3" bordercolor="yellow" height="200" src="..\images\flag.gif"></img>
</td>
			</table>
			<br><br><br>
 <table width="100%" cellspacing="1" cellpadding="1" border="0" align="center">
<tbody>
<%
if(party.equals("Congress"))
{
	%>
<tr><th><font size="6"><%=party%> Party</font></th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr>
<td>&nbsp;<a href="../html/agenda.html" name="agenda"><font size="5"><img src="..\images\conglogo.gif"/></font></a></td>
<td>
<table border="1" bordercolor="green" width="100%" height="20%">
<tr>
<td>&nbsp;<a href="../html/agenda.html" name="agenda"><font size="5">Agenda</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/leadermessage.html" name="leadermessage"><font size="5">Leader Message</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/partyhistory.html" name="partyhistrory"><font size="5">Party Descrption</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/forcasteonindia.html" name="forcasteonindia"><font size="5">Forcaste On India</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMP.jsp" name="membersformp"><font size="5">Members For Mp</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMLA.jsp" name="membersformla"><font size="5">Members For MLA</font></a></td></tr>
</tbody></table> 
</td>
</tr>
<%
}
	else if(party.equals("TDP"))
	{
		%>
		<tr><th><font size="6"><%=party%> Party</font></th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr>
<td>&nbsp;<a href="../html/agenda.html" name="agenda"><font size="5"><img src="..\images\tdp.gif"/></font></a></td>
<td>
<table border="1" bordercolor="green" width="100%" height="20%">
<tr>
<td>&nbsp;<a href="../html/TDPAgenda.html" name="agenda"><font size="5">Agenda</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/TDPleadermessage.html" name="leadermessage"><font size="5">Leader Message</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/TDPpartyhistory.html" name="partyhistrory"><font size="5">Party Descrption</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/TDPforcasteonindia.html" name="forcasteonindia"><font size="5">Forcaste On India</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMP.jsp" name="membersformp"><font size="5">Members For Mp</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMLA.jsp" name="membersformla"><font size="5">Members For MLA</font></a></td></tr>
</tbody></table> 
</td>
</tr>
<%
	}
		else if(party.equals("TRS"))
	{
		%>
		<tr><th><font size="6"><%=party%> Party</font></th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr>
<td>&nbsp;<a href="../html/agenda.html" name="agenda"><font size="5"><img src="..\images\kcr.gif"/></font></a></td>
<td>
<table border="1" bordercolor="green" width="100%" height="20%">
<tr>
<td>&nbsp;<a href="../html/TRSAgenda.html" name="agenda"><font size="5">Agenda</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/TRSleadermessage.html" name="leadermessage"><font size="5">Leader Message</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/TRSpartyhistory.html" name="partyhistrory"><font size="5">Party Descrption</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/TRSforcasteonindia.html" name="forcasteonindia"><font size="5">Forcaste On India</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMP.jsp" name="membersformp"><font size="5">Members For Mp</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMLA.jsp" name="membersformla"><font size="5">Members For MLA</font></a></td></tr>
</tbody></table> 
</td>
</tr>
<%
	}
		else if(party.equals("BJP"))
	{
		%>
		<tr><th><font size="6"><%=party%> Party</font></th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr>
<td>&nbsp;<a href="../html/agenda.html" name="agenda"><font size="5"><img src="..\images\bjpsymbol.gif"/></font></a></td>
<td>
<table border="1" bordercolor="green" width="100%" height="20%">
<tr>
<td>&nbsp;<a href="../html/BJPAgenda.html" name="agenda"><font size="5">Agenda</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/BJPleadermessage.html" name="leadermessage"><font size="5">Leader Message</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/BJPpartyhistory.html" name="partyhistrory"><font size="5">Party Descrption</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/BJPforcasteonindia.html" name="forcasteonindia"><font size="5">Forcaste On India</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMP.jsp" name="membersformp"><font size="5">Members For Mp</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMLA.jsp" name="membersformla"><font size="5">Members For MLA</font></a></td></tr>
</tbody></table> 
</td>
</tr>
<%
	}
		else if(party.equals("RudhraNethra")|| party.equals("Other"))
	{
		%>
		<tr><th><font size="6"><%=party%> Party</font></th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr>
<table border="0" bordercolor="green" width="100%" height="20%">
<tr>
<td>&nbsp;<a href="../html/eagenda.html" name="agenda"><font size="5">Agenda</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/eleadermessage.html" name="leadermessage"><font size="5">Leader Message</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/epartyhistory.html" name="partyhistrory"><font size="5">Party Descrption</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/eforcasteonindia.html" name="forcasteonindia"><font size="5">Forcaste On India</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMP.jsp" name="membersformp"><font size="5">Members For Mp</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMLA.jsp" name="membersformla"><font size="5">Members For MLA</font></a></td></tr>
</tbody></table> 
</td>
</tr>
<%
	}
		else
			{
		%>
		<tr><th><font size="6"><%=party%> Party</font></th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr>
<table border="0" bordercolor="green" width="100%" height="20%">
<tr>
<td>&nbsp;<a href="../html/eagenda.html" name="agenda"><font size="5">Agenda</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/eleadermessage.html" name="leadermessage"><font size="5">Leader Message</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/epartyhistory.html" name="partyhistrory"><font size="5">Party Descrption</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../html/eforcasteonindia.html" name="forcasteonindia"><font size="5">Forcaste On India</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMP.jsp" name="membersformp"><font size="5">Members For Mp</font></a></td></tr>
<tr>
<td>&nbsp;<a href="../jsp/membersofMLA.jsp" name="membersformla"><font size="5">Members For MLA</font></a></td></tr>
</tbody></table> 
</td>
</tr>
<%
	}
		%>


  </body>
</html>
