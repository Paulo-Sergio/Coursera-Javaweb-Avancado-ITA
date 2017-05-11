<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Tela de Cadastro</h2>

	<form method="POST" action="cadastro">
		<label>Nome: </label><input type="text" name="nome"><br>
		<label>Login: </label><input type="text" name="login"><br>
		<label>Email: </label><input type="text" name="email"><br>
		<label>Senha: </label><input type="password" name="senha"><br>
		
		<input type="submit" value="Cadastrar">
	</form>
	
	<c:if test="${not empty info}">
		<p>${info}</p>
	</c:if>

</body>
</html>