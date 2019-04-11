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
<ul>
    <li><a href="/mainPage">Strona domowa</a></li>
    <li><a href="/logout">Wyloguj się</a><br></li>
</ul>

<h1>Witaj na stronie Legii Akademickiej</h1>
<c:choose>
    <c:when test="${not empty sessionScope.user}">


        <p>akcje do wykonania</p>
        <a href="/proposal">Złóż podanie</a><br>
        <a href="/updateProposal">Popraw podanie</a><br>

        <p>Materiały do pobrania</p>
        <a href="/proposalCatalog">Katalog podań</a><br>
        <a href="/ordinance">Zarządzenie</a><br>
        <a href="/schedule">Plan zajęć</a><br>
        <a href="/statute">Regualmin</a><br>

        <c:choose>
            <c:when test="${not empty sessionScope.admin}">
                <br>
                <c:out value="${sessionScope.admin}"></c:out>
                <p>Panel Admina</p>

                <a href="/MoveToMail">Przejdź do panelu wysyłania wiadomości</a>

            </c:when>
        </c:choose>

    </c:when>
    <c:otherwise>
        <p>Nie zalogowany</p>
        <a class="plain" href="/login">Zaloguj się</a><br><br><br>
        <a class="plain" href="/register">Zarejestruj się</a>
    </c:otherwise>
</c:choose>

<footer>
    <p>Developed by: Fabian Bogusławski</p>
    <p>Contact: <a href="mailto:fab123@student.ukw.edu.pl">
        fab123@student.ukw.edu.pl</a>.</p>
</footer>
</div>
</body>
</html>

