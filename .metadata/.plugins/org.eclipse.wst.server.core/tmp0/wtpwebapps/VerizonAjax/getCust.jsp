<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String nm=request.getParameter("nm");
String hint="";
Class.forName("oracle.jdbc.driver.OracleDriver"); //Registering JDBC driver
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
PreparedStatement pst= con.prepareStatement("select ename,job from emp where ename=?");
pst.setString(1,nm);
ResultSet rs = pst.executeQuery();
response.getWriter().write("<table border=1>");
if(rs.next())
{
	response.getWriter().write("<tr><td><b>NAME</b><td>"+rs.getString(1)+"</tr>");
	response.getWriter().write("<tr><td><b>DESG</b><td>"+rs.getString(2)+"</tr>");
}
response.getWriter().write("</table>");
%>
</body>
</html>