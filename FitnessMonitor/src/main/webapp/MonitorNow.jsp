<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="mum.fpp.fm.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body style="width: 100%; height: 100%;">
	<div style="top: 30%; right: 30%; left: 37%; position: absolute;">

		<%
			UserInfo userInfo = new UserInfo();
			userInfo.setFirstName(request.getParameter("firstName"));
			userInfo.setLastName(request.getParameter("lastName"));
			userInfo.setMemberId(Integer.parseInt(request.getParameter("memberId")));
			//userInfo.setMemberId("help");
			userInfo.setSex(request.getParameter("sex"));
			userInfo.setAge(Integer.parseInt(request.getParameter("age")));
			userInfo.setWeight(Integer.parseInt(request.getParameter("weight")));
			userInfo.submitUserInfo(userInfo);
		%>

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

