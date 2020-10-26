<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href='static/styles.css' type="text/css"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="background-color: darkgray; width: 92%;margin-left: 60px; border-radius: 40px;" >
    <p style="text-align: center; font-size: 30px;">${statistique.country}</p>
 </div>
 <table   	style="text-align:center;" align="center"  width="100%">
 	<tr><th>confirmed</th><th>recovered </th> <th>deaths</th></tr>
 	<tr><th>${statistique.confirmed}</th><th>${statistique.recovered} </th> <th>${statistique.deaths}</th></tr>
 </table>
<h1 style="color:red; "  align="center" >Table des pays  de ce continent</h1> 
<table  border="1" 	style="text-align:center;" align="center"  width="100%">
	<tr><td>Date</td><td>Country </td><td>Confirmed</td><td>Recovered </td> <td>Deaths</td></tr>
		<c:forEach items="${continent.pays}" var="line" varStatus="vs">
			<tr>
				<td>	<c:out value="${line.date }"> </c:out></td>
				<td>	<c:out value="${line.country }"> </c:out></td>
				<td>	<c:out value="${line.confirmed }"> </c:out></td>
				<td>	<c:out value="${line.recovered }"></c:out> </td>
				<td>	<c:out value="${line.deaths }"></c:out> </td>
			</tr>
			<tr>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>