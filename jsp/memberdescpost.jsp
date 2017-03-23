<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
String s = request.getParameter("partyname");
session.setAttribute("partyname",s);

%>
<html>
  <head>
    <title>memberdescpost.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

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
			</table>
			</th>
			<%
			if(s.equals("Congress"))
			{
				%>
			<th align="center" width="20%">
<img src="../images\congsymbol.gif" border=3/>
</th>
<%
		}
				else if(s.equals("TDP"))
			{
				%>
			<th align="center" width="20%">
<img src="../images\tdp.gif" border=3/>
</th>
<%
		}
					else if(s.equals("BJP"))
			{
				%>
			<th align="center" width="20%">
<img src="../images\bjpsymbol.gif" border=3/>
</th>
<%
		}
%>
</th>
</table>
  <form action="../memberdescpost">
    <table width="200"  align="center">
<tbody>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr>
<td>&nbsp;POST</td>
<td>&nbsp;<input type="radio" name="post" value="MP" checked>MP
<input type="radio" name="post" value="MLA">MLA</td></tr>
<tr>
<td>&nbsp;NAME</td>
<td>&nbsp;<input type="text" name="name"></td></tr>
<tr>
<td>&nbsp;AGE</td>
<td>&nbsp;<input type="text" name="age"></td></tr>
<tr>
<td>BIRTH PLACE<br></td>
<td>&nbsp;<input type="text" name="birth"></td></tr>
<tr>
<td>&nbsp;PARTICIPATING PLACE <br></td>
<td>&nbsp;<input type="text" name="place"></td></tr>
<tr>
<td>&nbsp;EDUCTION BACKGROUND<br></td>
<td>&nbsp;<input type="text" name="eduction"></td></tr>
<tr>
<td>&nbsp;PROPERTY VALUE<br></td>
<td>&nbsp;<input type="text" name="value"></td></tr>
<tr>
<td>&nbsp;POLICE RECORD<br></td>
<td>&nbsp;<input type="radio" name="police" value="yes">Yes
<input type="radio" name="police" value="no">No</td></tr>
<tr><td>&nbsp;</td>
<td><input type="submit" name="submit" value="submit"></td>
</tr>
</tbody></table> 
</form>
  </body>
</html>
