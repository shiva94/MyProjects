<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="form" method="get">
Username:<input type="text" name="uname"><br>
Password:<input type="password" name="pwd"><br>
<input type="hidden" name="hide" />
<!-- <input type="submit" value="ok"  onclick="Action.jsp" name="ok"> -->
 <input type="submit" name="ok" value="ok" onclick="this.form.hide.value=this.value;this.form.action='Action.jsp?flag=1&act=1';this.form.submit();" />
<!-- <input type="submit" value="cancel" onclick="Login.jsp" name="ok">-->
<input type="submit" name="cancel" value="cancel" onclick="this.form.hide.value=this.value;this.form.action='Login.jsp?flag=1&act=1';this.form.submit();" />
</form>
</body>
</html>