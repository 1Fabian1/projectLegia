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

<form class="form-signin" action="/sendMail" method="POST">
    <h1 class="h3 mb-3 font-weight-normal">Zaloguj się</h1>
    <label for="inputEmail" class="sr-only">Nazwa użytkownika</label>
    <input type="text" id="inputEmail" name="j_username" class="form-control" placeholder="Nazwa użytkownika" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" name="j_password" class="form-control" placeholder="Password" required>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Zaloguj</button>

</form>

<p>Witaj w panelu odpowiadającym za wysyłanie wiadomości</p>

<
<form method="POST" action="/sendMail" id="mailForm">
    Temat wiadomości:
    <input type="text" name="MailTopic"><br>
    Treść wiadomości:<br>
    <textarea name="mailMessage" form="mailForm" rows="20" cols="100">Treść wiadomości</textarea><br><br>
    <input type="submit" value="Wyślij do wszystkich">
</form>





<%--
<button type="button" size="10px">
    <jsp:useBean id="sendEmail" class="pl.Legia.services.SendEmail"/>
    ${sendEmail.sendEmail("Temat wiadomości","Treść nowej wiadomości",sessionScope.allUsers)}
    Send To All
</button>
--%>
</body>
</html>
