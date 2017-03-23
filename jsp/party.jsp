<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Vector"%>


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
    <title>PartyDescription.html</title>
	 <SCRIPT LANGUAGE="JavaScript">
  function go(k)
   {
  window.alert("you have selected option"+k);
   var i=k;
   window.open("../jsp/Congdesc.jsp?k="+i);
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
					
				</tr>
			</table>
    <table width="200" cellspacing="0" cellpadding="5"  align="center">
<tbody>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<tr><th>&nbsp;</th></tr>
<%
int i=1;
Vector v =new Vector();
v.add("");
while(rs.next())
{
v.add(new Integer(i));

%>
<tr >
<td>&nbsp;<a href="./party.jsp" onclick='go(<%=v.get(i)%>)'><%=rs.getString("partyname")%></a></td>
</tr>
<%
i++;
}
%>

</tbody></table> <br>
  </body>
</html>
