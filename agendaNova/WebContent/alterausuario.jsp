<%@ page import="java.util.*,
br.com.agendaNova.dao.*,
br.com.agendaNova.modelo.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<h1>Altera��o de Usu�rios</h1>

<form action="Sistema" method="post">
	<div class="campos">
		<label for="usuarios.nome">ID.:</label>
		<input type="text" name="usuario" value="${param.id}" readonly="true"/>
	</div>
	<div class="campos">
		<label for="usuarios.id">Usu�rio.:</label>
		<input type="text" name="usuario" value="${param.usuario}"/>
	</div>
	<div class="campos">
		<label for="email">E-Mail.:</label>
		<input type="text" name="email" value="${param.email}" required="true"/>
	</div>
	<div class="campos">
		<label for="senha">Senha.:</label>
		<input type="text" name="senha" value="${param.senha}" required="true"/>
	</div>
	<div class="campos">
		<label for="ddd">DDD.:</label>
		<input type="text" name="ddd" value="${param.ddd}" required="true"/>
	</div>
	<div class="campos">
		<label for="numero">N�mero.:</label>
		<input type="text" name="numero" value="${param.numero}" required="true"/>
	</div>
	<input type="hidden" name="logica" value="AlteraUsuario" checked/><br/>
	<input type="submit" name="AtualizarUsuario" value="Gravar Altera��o"/>
</form>



<input type="button" value="Voltar" onClick="history.go(-1)">
</body>
</html>