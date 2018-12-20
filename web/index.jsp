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
<body>
        <div>
                <nav>
                    <ul>
                            <li><a href=mainPage.jsp>Strona Domowa</a></li>
                            <li><a href=/register>Rejestracja</a></li>
                            <li><a href=/login>Logowanie</a></li>
                            <li><a href="/proposal">Wniosek</a></li>
                    </ul>
            </nav>
        </div>
    <h1>Witaj</h1>

    <c:choose>
  <c:when test="${not empty sessionScope.user}">
   	<li><a href="index.jsp">Wyloguj się</a></li>
      <li><a href="mainPage.jsp">Strona główna</a></li>
  </c:when>
  <c:otherwise>
 	<li><a href="/login">Zaloguj się</a></li>
      <li><a href="/register">Zarejestruj się</a></li>
 </c:otherwise>
</c:choose>
</body>
</html>

