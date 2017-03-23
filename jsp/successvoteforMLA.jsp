<%@page import="java.util.StringTokenizer"%>
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
<script type="text/javascript">
function back()
{

}

</script>
  </head>
  
  <BODY bgcolor="#A3ADAO">
		<form action="./jsp/thanks.jsp" method="post">
			<table border="0" width="100%" height="10%">
				<tr>
					<th>
						&nbsp;
					</th>
				</tr>
				<tr>
					<th align="center">
						<font size="6"> SECURE VOTING</font>
					</th>
					
				</tr>
			</table> 
   <table width="100%" border="0" align="center">
<tbody>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<BR><BR>
<%
String names = (String) session.getAttribute("personname");
StringTokenizer st = new StringTokenizer(names,",");
String name[] = new String[2] ;
int i=0;
while(st.hasMoreElements())
{
name[i] = st.nextToken();
i++;
}
%>
<BR><BR><BR><BR>
<pre><CENTER>YOU ARE VOTING FOR     <B><%=name[0]%></B>     FROM     <B><%=name[1]%></B>     PARTY</CENTER></pre>
<tr><td align="right">
<input type="submit" value="VOTE"/></td>
<td align="left">
<input type="submit" onclick='back' value="BACK"/></td>
</tr>
</tbody>
</table>
</form>
</body>

</html>
