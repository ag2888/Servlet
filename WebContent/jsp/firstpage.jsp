<html>
<body>
<h2>Welcome </h2>
<table>
	<tr>
		<td>USER:</td>
		<td><%=request.getAttribute("account") %></td>
	</tr>
	<tr>
		<td>PASSWORD:</td>
		<td><%=request.getAttribute("password") %></td>
	</tr>
</table>	
</body>
</html>