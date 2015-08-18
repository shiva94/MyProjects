<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n= request.getParameter("name");
String p= request.getParameter("pwd");

if(n.equals("admin") && p.equals("admin")){%>
HttpSession session1= request.getSession(true);
session1.setAttribute("name","admin");
<jsp:forward page="admin.jsp"></jsp:forward>
<%} else if(n.equals("shiva") && p.equals("shiva")){%>
<jsp:forward page="user.jsp"></jsp:forward>
<%} else if(n.equals("") && p.equals("")){%>
<h2><font color="red">User name and pwd cannot be empty</font></h2>
<jsp:include page="login.jsp"></jsp:include>
<%} else{%>
<h2> Invalid please re login</h2>
<jsp:include page="login.jsp"></jsp:include>
<%} %>
</body>
</html>