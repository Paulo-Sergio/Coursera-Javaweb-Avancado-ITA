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

		<h1>Bem vindo: ${usuarioLogado.getNome()}</h1>
		<h3>Seus Topicos</h3>

		<table>
			<tr>
				<th>Titulo</th>
				<th>Nome do Usuário</th>
				<th>Ação</th>
			</tr>
			<c:forEach var="topico" items="${topicos}">
				<tr>
					<td>${topico.getTitulo()}</td>
					<td>${topico.getUsuario().getNome()}</td>
					<td><a href="exibirTopico?id_topico=${topico.getIdTopico()}">exibir</a></td>
				</tr>
			</c:forEach>
		</table>
		<br> 
		<a href="criarTopico">Criar Tópico</a> | 
		<a href="ranking">Ver Raking</a>

	</div>
</body>
</html>