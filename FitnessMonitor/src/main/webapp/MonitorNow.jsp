<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body style="width: 100%; height: 100%;">
	<div style="top: 30%; right: 30%; left: 37%; position: absolute;">

		<%
			// Grab the variables from the form.
			String choice = request.getParameter("choice");
		%>
		<%
			if (choice.equalsIgnoreCase("intput performance")) {
		%>
		<jsp:forward page="InputPerformance.jsp"></jsp:forward>
		<%
			} else if (choice.equalsIgnoreCase("history")) {
		%>
		<jsp:forward page="History.jsp"></jsp:forward>
		<%
			}
		%>

	</div>

</body>
</html>

