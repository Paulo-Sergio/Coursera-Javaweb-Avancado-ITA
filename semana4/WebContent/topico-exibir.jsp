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

form textarea {
	width: 100%;
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

		<h2>Exibindo o tópico por completo</h2>

		<h3>Titulo: ${topico.getTitulo()}</h3>
		<h4>Autor: ${topico.getUsuario().getNome()}</h4>
		<p>${topico.getConteudo()}</p>

		<br> <a href="topicos">Voltar</a>

		<hr>

		<h2>Comentários</h2>
		<table>
			<tr>
				<th>Autor</th>
				<th>Comentário</th>
			</tr>
			<c:forEach var="comentario" items="#{comentariosDoTopico}">
				<tr>
					<td>${comentario.getUsuario().getNome()}</td>
					<td>${comentario.getComentario()}</td>
				</tr>
			</c:forEach>
		</table>
		<br>

		<form method="POST" action="exibirTopico">
			<fieldset>
				<legend>Escreva um novo comentário:</legend>
				<input type="hidden" value="${topico.getIdTopico()}" name="idTopico">
				<textarea rows="6" name="comentario"></textarea>
				<input type="submit" value="Adicionar Comentário">
			</fieldset>
		</form>

	</div>
</body>
</html>