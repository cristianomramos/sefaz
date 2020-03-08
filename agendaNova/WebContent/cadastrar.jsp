<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuário</title>
</head>
<body>
<h1>Cadastro de Usuário</h1>
<%--<form action="contato_adicionado.html" method="post">--%>
<form action="Sistema" method="post">
<%--<meta http-equiv="refresh" content="3; index.html">--%>
Nome:<input type="text" name="nome"/><br/>
<br/>
E-mail:<input type="email" name="email"/><br/>
<br/>
Senha:<input type="password" name="senha"/><br/>
<br/>
DDD(1):<input type="number" name="ddd1"/> Telefone(1) :<input type="tel" name="numero1"/> Tipo(1):<input type="text" name="tipo1"/><br/>
<br/>
DDD(2):<input type="number" name="ddd2"/> Telefone(2) :<input type="tel" name="numero2"/> Tipo(2):<input type="text" name="tipo2"/><br/>
<br/>
DDD(3):<input type="number" name="ddd3"/> Telefone(3) :<input type="tel" name="numero3"/> Tipo(3):<input type="text" name="tipo3"/><br/>

<input type="hidden" name="logica" value="InserirContato" checked/><br/>

<input type="submit" value="inserir"/><input type="button" value="Voltar" onClick="history.go(-1)">
</form>
</body>


</html>