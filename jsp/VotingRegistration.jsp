<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>


<jsp:useBean id="votingregistrationbean" class="com.securevoting.bean.VotingRegistrationBean" scope="session"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>My JSP 'Registration.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body  bgcolor="tan">
      <table border ="2" bordercolor="green" width="80%" height="10%">
  
  <tr>
  <th align="left" width="50%" height="20%"><font size="7" color="#BF044A"><i>S</font><font color="#BF044A">ecure</font><font size="7" color="#BF044A">V</font><font color="#BF044A">oting</i>&nbsp;&nbsp;&nbsp;<a href="./html/Home.html">home</a></font></th>
  
<td width="30%">
 <img width="300" border="3" bordercolor="yellow" height="200" src=".\images\flag.gif"></img>
</td>
 </table><br>
 <br>
        <table><tr><th>	<font size="4">ur votingregistration number is : </font></th>
        <td><jsp:getProperty name="votingregistrationbean" property="voteID"/>
        </td>
        </tr>
        </table> <br>
    	<a href="./html/voter.html">click here to go to the home page</a> 
     <br>
  </body>
</html>
