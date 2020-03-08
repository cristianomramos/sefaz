<%@ page import="java.util.*,
br.com.agendaNova.dao.*,
br.com.agendaNova.modelo.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<h1>Lista de Usuários</h1>
</td>
<table border=1 cellspacing=0 cellpadding=2 bordercolor="666633">
<thead bgcolor="gray">
<tr>
<th><FONT color="white">Id Usuário</th>
<th><FONT color="white">Nome</th>
<th><FONT color="white">E-Mail</th>
<th><FONT color="white">DDD</th>
<th><FONT color="white">Telefone</th>
<th><FONT color="white">Tipo</th>
</tr>
</thead>

<c:forEach var="usuario" items="${usuarios}">
<tr>

<td style="text-align: center;">${usuario.id}</td>
<td>${usuario.nome}</td>
<td>${usuario.email}</td>
<td style="text-align: center;">${usuario.phone.ddd}</td>
<td style="text-align: center;">${usuario.phone.numero}</td>
<td>${usuario.phone.tipo}</td>
</tr>

</c:forEach>


</table>
</body>
</html>