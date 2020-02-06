<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<%
	int prvi = (int)Math.ceil(Math.random()*10);
	int drugi = (int)Math.ceil(Math.random()*10);
%>

<body>
<form action="Servlet" method="post">
<table>
	<tr>
		<th colspan="2">VALIDACIONA FOMRA</th>
	</tr>
	<tr>
		<td align="right">IME:</td>
		<td><input type="text" name="ime"/></td>
	</tr>
	<tr>
		<td align="right">PREZIME:</td>
		<td><input type="text" name="prezime"/></td>
	</tr>
	<tr>
		<td align="right">GODINE:</td>
		<td><input type="text" name="godine"/></td>
	</tr>
	<tr>
		<td align="right">SIFRA:</td>
		<td><input type="password" name="sifra"/></td>
	</tr>
	<tr>
		<td align="right"><%=prvi %>+<%=drugi %>=</td>
		<td>
			<input type="text" name="validacija"/>
			
			<!-- sakriveno slanje generisanih brojva -->
			<input type="hidden" name="zbir" value="<%=prvi+drugi %>"/>
		</td>
	</tr>
	<tr>
	<td colspan="2" align="right"><input type="submit" value="Potvrdi"/></td>
	</tr>
	<!-- ATRIBUT MOŽE DA SE POKUPI I PREKO JSTL SA ${msg} -->
	<tr>
		<td colspan="2" align="center">
		<!-- Prihvatanje atributa msg -->
		<%
			String msg = (String)request.getAttribute("msg");
			if (msg != null){
		%>
			<%= msg %>
		<%  } %>
		</td>
	</tr>
</table>
</form>

</body>
</html>