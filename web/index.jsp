<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 01.12.2018
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <title>Witaj na stronie Legii Akademickiej</title>
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet">
</head>
<body>
    <h1>czolo</h1>
    <c:choose>
  <c:when test="${not empty sessionScope.user}">
   	<li><a href="index.jsp">Wyloguj się</a></li>
      <li><a href="/proposal">Złóż wniosek</a></li>
  </c:when>
  <c:otherwise>
 	<li><a href="/proposal">Zaloguj się</a></li>
      <li><a href="/register">Zarejestruj się</a></li>

 </c:otherwise>
</c:choose>
</body>
</html>

