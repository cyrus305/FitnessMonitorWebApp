<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input Performance</title>
</head>
<body style="width: 100%; height: 100%;">
	<div
		style="top: 10%; right: 30%; left: 35%; position: absolute; background: #F6F6F2">
		<div style="margin: 20px 20px">

			<%
				// Grab the variables from the form.
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				String memberID = request.getParameter("memberId");
			%>

			<div align="left">
				<h2>
					Hello,
					<%=firstName%>
					<%=lastName%>!
				</h2>
			</div>
			<div align="right">
				<h3>
					Member ID: <%=memberID%>
				</h3>
			</div>

			<h2>Input your performance</h2>
			<ul>
				<li><input TYPE="button" NAME="trademill" VALUE="TradeMill"
					onClick="window.open('TradeMill.jsp','mywindow','width=300,height=250,top=300,buttom = 300, left =900, toolbar=no,resizable=no,menubar=no')"><br>
				<br></li>
				<li><input TYPE="button" NAME="Dumbell" VALUE="Dumbell"
					onClick="window.open('Dumbell.jsp','mywindow','width=300,height=250,top=300,buttom = 300, left =900, toolbar=no,resizable=no,menubar=yes')"><br>
				<br></li>
				<li><input TYPE="button" NAME="Swim" VALUE="Swimmming"
					onClick="window.open('Swimming.jsp','mywindow','width=300,height=250,top=300,buttom = 300, left =900, toolbar=no,resizable=no,menubar=yes')"><br>
				<br></li>
				<li><input TYPE="button" NAME="Push-ups" VALUE="Push-ups"
					onClick="window.open('PushUps.jsp','mywindow','width=300,height=250,top=300,buttom = 300, left =900, toolbar=no,resizable=no,menubar=yes')"><br>
				<br></li>
			</ul>


		</div>

	</div>

</body>
</html>