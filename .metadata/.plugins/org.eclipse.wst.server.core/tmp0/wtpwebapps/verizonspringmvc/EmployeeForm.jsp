<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
color: #ff0000
}
</style>
</head>
<body>
<s:form action="emplform.htm" method="post" commandName="employee">
Enter empcode <s:input path="empcode"/><br><s:errors path="empcode" cssClass="error"></s:errors><br>
Enter empname <s:input path="empname"/><br><s:errors path="empname" cssClass="error"></s:errors><br>
Enter salary <s:input path="salary"/><br> <s:errors path="salary" cssClass="error"></s:errors><br>
<input type="submit">
</s:form>
</body>
</html>