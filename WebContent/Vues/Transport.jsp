<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="chercher.do" method="get">
		MC: <input type="text" name="motCle" value="${mc}">
		<input type="submit" value="OK">
	</form>
	<form action="marchandisesParCarg.do" method="get">
		Marchandises:
		<select name="refCarg" >
			<c:forEach items="${cargaisons}" var="c">
				<option value="${c.reference}" 
					<c:if test="${c.reference == refCarg}">selected="selected"</c:if> >
				${c.reference}
				</option>
			</c:forEach>
		</select>
		<input type="submit" value="OK">
	</form>
	<table border="1" width="90%">
		<tr>
			<th>Num</th><th>Nom</th><th>Poids</th><th>Vol</th><th>Cargaison</th>
		</tr>
		<c:forEach items="${marchandises}" var="m">
			<tr>
				<td>${m.numero}</td>
				<td>${m.nom}</td>
				<td>${m.poids}</td>
				<td>${m.volume}</td>
				<td>${m.cargaison.reference}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>