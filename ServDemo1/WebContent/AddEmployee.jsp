<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function verify(str) {
var xmlhttp;
if(str.length==0)
	{
	document.getElementById("txtHint").innerHTML="";
	return;
	}
if(window.XMLHTTPRequest)//Non-IE
	{
	xmlhttp=new XMLHttpRequest();
	}
else
	{
	xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");//IE
	}
xmlhttp.onreadystatechange=function()
	{
	if(xmlhttp.readyState==4 && xmlhttp.status==200)
		{
		document.getElementById("txtHint").innerHTML=xmlhttp.responseText;
		}
	}
xmlhttp.open("GET","validate1.jsp?nm="+str,true);
xmlhttp.send();
}
</script>
</head>
<body>
<form action="">
Enter empcode:<input type="text" name="empcode" onblur="verify(this.value)"><p>Status: <span id="txtHint"></span> </p>

</form>
</body>
</html>