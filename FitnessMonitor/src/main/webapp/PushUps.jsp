<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PushUps</title>
</head>
<body bgcolor="#BCBCB3">

	<form>

		Hours: <input type="text" name="hours"> <br>
		<br> PushUp Count: <input type="text" name="noOfTimes"><br>
		<br> <input type="submit" value="Submit"> <input
			type="submit" value="Reset">

	</form>

	<%
		String hours = request.getParameter("hours");
		String noOfTimes = request.getParameter("noOfTimes");
	%>
	<BR>
</body>
</html>