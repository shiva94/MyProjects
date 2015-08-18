<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" class="com.demo.Employee"></jsp:useBean>
	<jsp:setProperty property="empcode" name="emp" value="123"/>
	<jsp:setProperty property="empname" name="emp" value="verizon"/>
	<jsp:setProperty property="salary" name="emp" value="123456"/>
	code = <jsp:getProperty property="empcode" name="emp"/><br>
	Name = <jsp:getProperty property="empname" name="emp"/><br>
	Salary = <jsp:getProperty property="salary" name="emp"/>
</body>
</html>