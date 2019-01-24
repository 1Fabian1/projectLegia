<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 01.12.2018
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <title>Witaj na stronie Legii Akademickiej</title>
    <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">
</head>

    <h1>Witaj na stronie Legii Akademickiej</h1>

    <c:choose>
  <c:when test="${not empty sessionScope.user}">
      <p>Zalogowany</p><br>
      <a href="/proposal">Złóż podanie</a><br>
      <a href="/proposalCatalog">Katalog podań</a><br>
      <a href="/logout">Wyloguj się</a><br>

  </c:when>
  <c:otherwise>
      <p>Nie zalogowany</p>
 	<a class="plain" href="/login">Zaloguj się</a><br><br><br>
      <a class="plain" href="/register">Zarejestruj się</a>
 </c:otherwise>
</c:choose>
</body>
</html>

