<%
String party = request.getParameter("partyname");
session.setAttribute("ptname",party);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>membersparticipating.html</title>
	
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
</td></tr>
			</table>
			</th>
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
</table>

  <form action="../memberparticipents" metod="post"> 
  <table width="100%" align="center">
  <%
  if(party.equals("Congress"))
  {
	  %>
<tr>
<td><img src="../images\sonia.gif" border=3/></td>
<td><img src="../images\monmohan.gif" border=3/></td>
<td><img src="../images\ys.gif" border=3/></td>
</tr>
<%
  }
else if(party.equals("TDP"))
{
	%>
<tr>
<td><img src="../images\tdp1.gif" border=3/></td>
<td><img src="../images\members2.gif" border=3/></td>
	</tr>
	<%
}
	else if(party.equals("TRS"))
{
	%>
<tr>
<td><img src="../images\kcr.gif" border=3/></td>
	</tr>
	<%
}
	else if(party.equals("BJP"))
{
	%>
<tr>
<td><img src="../images\vaj.gif" border=3/></td>
<td><img src="../images\lk.gif" border=3/></td>
	</tr>
	<%
}

%>


<tr><td>&nbsp;</td></tr>
<tr><td align="center"><font size="5">Members Participating for <%=party%> MP Post</font></td></tr>

 </table>  
<table width="200" border="0" align="center">

<tr><td>&nbsp;</td></tr>
<tr>
<td align="center">&nbsp;PERSON</td>
<td align="center">&nbsp;PLACE</td>
<td align="center">&nbsp;POST</td>
<td align="center">&nbsp;PERSONDESC</td>

<tr>
<td>&nbsp;<input type="text" name="mpperson1"></td>
<td>&nbsp;<input type="text" name="mpplace1"></td>
<td>&nbsp;<input type="text" name="mppost1" value="MP"></td>
<td>&nbsp;<input type="text" name="mppersondesc1"></td>

<tr>
<td>&nbsp;<input type="text" name="mpperson2"></td>
<td>&nbsp;<input type="text" name="mpplace2"></td>
<td>&nbsp;<input type="text" name="mppost2" value="MP"></td>
<td>&nbsp;<input type="text" name="mppersondesc2"></td>
</tr>
<tr>
<td>&nbsp;<input type="text" name="mpperson3"></td>
<td>&nbsp;<input type="text" name="mpplace3"></td>
<td>&nbsp;<input type="text" name="mppost3" value="MP"></td>
<td>&nbsp;<input type="text" name="mppersondesc3"></td>
</tr>
</table>
<table width="100%" align="center">
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>

<tr><td align="center"><font size="5">Members Participating for <%=party%> MLA Post</font></td></tr>
</table>
<table width="200" border="0" align="center">
<tr><td>&nbsp;</td></tr>
<tr>
<td align="center">&nbsp;PERSON</td>
<td align="center">&nbsp;PLACE</td>
<td align="center">&nbsp;POST</td>
<td align="center">&nbsp;PERSONDESC</td>

<tr>
<td>&nbsp;<input type="text" name="mlaperson1"></td>
<td>&nbsp;<input type="text" name="mlaplace1"></td>
<td>&nbsp;<input type="text" name="mlapost1" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc1"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson2"></td>
<td>&nbsp;<input type="text" name="mlaplace2"></td>
<td>&nbsp;<input type="text" name="mlapost2" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc2"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson3"></td>
<td>&nbsp;<input type="text" name="mlaplace3"></td>
<td>&nbsp;<input type="text" name="mlapost3" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc3"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson4"></td>
<td>&nbsp;<input type="text" name="mlaplace4"></td>
<td>&nbsp;<input type="text" name="mlapost4" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc4"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson5"></td>
<td>&nbsp;<input type="text" name="mlaplace5"></td>
<td>&nbsp;<input type="text" name="mlapost5" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc5"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson6"></td>
<td>&nbsp;<input type="text" name="mlaplace6"></td>
<td>&nbsp;<input type="text" name="mlapost6" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc6"></td>
</tr>
<tr>
<td>&nbsp;<input type="text" name="mlaperson7"></td>
<td>&nbsp;<input type="text" name="mlaplace7"></td>
<td>&nbsp;<input type="text" name="mlapost7" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc7"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson8"></td>
<td>&nbsp;<input type="text" name="mlaplace8"></td>
<td>&nbsp;<input type="text" name="mlapost8" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc8"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson9"></td>
<td>&nbsp;<input type="text" name="mlaplace9"></td>
<td>&nbsp;<input type="text" name="mlapost9" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc9"></td>
</tr>
<tr>
<td>&nbsp;<input type="text" name="mlaperson10"></td>
<td>&nbsp;<input type="text" name="mlaplace10"></td>
<td>&nbsp;<input type="text" name="mlapost10" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc10"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson11"></td>
<td>&nbsp;<input type="text" name="mlaplace11"></td>
<td>&nbsp;<input type="text" name="mlapost11" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc11"></td>
</tr>

<tr>
<td>&nbsp;<input type="text" name="mlaperson12"></td>
<td>&nbsp;<input type="text" name="mlaplace12"></td>
<td>&nbsp;<input type="text" name="mlapost12" value="MLA"></td>
<td>&nbsp;<input type="text" name="mlapersondesc12"></td>
</tr>
<tr><td>&nbsp;</td>
<td align="center"><input type="submit"  value="submit"></td>
<td align="center"><input type="reset"  value="cancel"></td></tr>
</table></form>
  </body>
</html>
