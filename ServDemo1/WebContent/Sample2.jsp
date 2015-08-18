<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name= request.getParameter("value");
switch(name.charAt(0)){
case 'r':{%>
<font color="red">Red</font>
<%break;}                                                                                                                                                                                    
case 'b':{%>
<font color="blue">Blue</font>
<%break;}
}%>
</body>
</html>