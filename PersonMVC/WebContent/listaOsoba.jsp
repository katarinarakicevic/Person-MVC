<%@page import="rs.Osoba"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista osoba</title>
</head>
<%
	ArrayList<Osoba> lo = (ArrayList<Osoba>)request.getAttribute("lo");
%>
<body>
<%
	if(lo!=null && lo.size()>0){
%>
	<h1>LISTA OSOBA</h1>
	<ul>
		<% for(int i = 0; i<lo.size();i++){ %>
		<li><%=lo.get(i) %></li>
		<%} %>
	</ul>
<%		
	}else{
		response.sendRedirect("index.jsp");
	}
%>
</body>
</html>
