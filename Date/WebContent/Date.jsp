<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jsDatePick Javascript example</title>

<link rel="stylesheet" type="text/css" media="all" href="js/jsDatePick_ltr.min.css" />
<link  rel="stylesheet" type="text/css" href="style/styles.css"/>
<script type="text/javascript" src="js/jsDatePick.min.1.3.js"></script>
<script type="text/javascript">
	window.onload = function(){
		new JsDatePick({
			useMode:2,
			target:"fromDate",
			dateFormat:"%d-%M-%Y"
			/*selectedDate:{				This is an example of what the full configuration offers.
				day:5,						For full documentation about these settings please see the full version of the code.
				month:9,
				year:2006
			},
			yearsRange:[1978,2020],
			limitToToday:false,
			cellColorScheme:"beige",
			dateFormat:"%m-%d-%Y",
			imgPath:"img/",
			weekStartDay:1*/
		});
			
	};
</script>
</head>
<body>   
<form name="pickerForm" action="servlet"  method="post">
    FromDate <input type="text" size="12" id="fromDate" /> &nbsp;&nbsp;
	 <input type="submit" class="vzbtn" id="buttonID" value="suspend" name="buttonID"/>
	 </form>
</body>
</html>
