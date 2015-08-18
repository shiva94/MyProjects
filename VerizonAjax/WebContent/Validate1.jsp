<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String nm=request.getParameter("nm");
Class.forName("oracle.jdbc.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
PreparedStatement pst=conn.prepareStatement("select ename from emp where empno=?");
pst.setString(1, nm);
ResultSet rs=pst.executeQuery();
if(rs.next()){
response.getWriter().write("Code already exists");
}
else
response.getWriter().write("valid code");
%>
</body>
</html>