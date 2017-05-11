<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	font-family: arial, sans-serif;
}

.conteudo {
	max-width: 1024px;
	margin: 0 auto;
}

table {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<div class="conteudo">

		<h2>Ranking de pontução dos usuários</h2>

		<table>
			<tr>
				<th>Nome</th>
				<th>Login</th>
				<th>QTD Pontos</th>
			</tr>
			<c:forEach var="rakingUsuarios" items="${rankingUsuarios}">
				<tr>
					<td>${rakingUsuarios.getNome()}</td>
					<td>${rakingUsuarios.getLogin()}</td>
					<td>${rakingUsuarios.getPontos()}</td>
				</tr>
			</c:forEach>
		</table>
		<br> 
		
		<a href="topicos">Voltar</a>
	</div>
</body>
</html>