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

	<h1>Entre com as informações</h1>
	
	<form method="POST" action="login">
		<label>Login:</label> <input type="text" name="login">
		<label>Senha:</label> <input type="password" name="senha">
		<input type="submit" value="Fazer Login">
	</form>
	
	<c:if test="${not empty erro}">
		<h4>Houve o seguinte problema: ${erro}</h4>
	</c:if>
	
	<c:if test="${not empty info}">
		<h4>${info}</h4>
	</c:if>
	
	<a href="cadastro">Cadastre-se Aqui!</a>
	
	
	
</body>
</html>