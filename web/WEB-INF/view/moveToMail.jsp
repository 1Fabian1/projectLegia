<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 04.03.2019
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wyślij wiadomość</title>
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/jumbotron.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">Legia Akademicka UKW</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Jesteś zalogowany</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/logout">Wyloguj się</a>
            </li>
        </ul>

    </div>
</nav>


<center>
    <p>Witaj w panelu odpowiadającym za wysyłanie wiadomości</p>
    <form method="POST" action="/sendMail" id="mailForm">
        Temat wiadomości:<br>
        <textarea name="MailTopic" rows="2" cols="45"></textarea><br>
        Treść wiadomości:<br>
        <textarea name="mailMessage" form="mailForm" rows="8" cols="45"></textarea><br><br>
        <input type="submit" value="Wyślij do wszystkich użytkowników">
    </form>
</center>




<%--
<button type="button" size="10px">
    <jsp:useBean id="sendEmail" class="pl.Legia.services.SendEmail"/>
    ${sendEmail.sendEmail("Temat wiadomości","Treść nowej wiadomości",sessionScope.allUsers)}
    Send To All
</button>
--%>
</body>
</html>
