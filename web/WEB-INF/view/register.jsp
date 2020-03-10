<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 01.12.2018
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <title>Zarejestruj się</title>
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/signin.css" rel="stylesheet">

</head>
<body >
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">Legia Akademicka UKW</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Jesteś nie zalogowany</a>
            </li>
        </ul>
    </div>
</nav>

<form class="form-signin" action="/register" method="POST">
    <h1 class="h3 mb-3 font-weight-normal">Zarejestruj się</h1>
    <!-- nazwa -->
    <label for="inputEmail" class="sr-only">Nazwa użytkownika</label>
    <input type="text" id="inputEmail" name="inputUsername" class="form-control" placeholder="Nazwa użytkownika" required autofocus>


    <!-- mail -->

    <label for="inputEmail" class="sr-only">Adres Mailowy</label>
    <input type="text" id="inputUser" name="inputEmail" class="form-control" placeholder="Adres email" required autofocus>

    <!-- haslo -->

    <label for="inputPassword" class="sr-only">Hasło</label>
    <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="Hasło" required>

    <!-- regulamin -->
    <a href="/regulations">Regulamin</a><br>
    <input type="checkbox" name="inputCheckbox" required>Akceptuję regulamin</p>
    <!-- akceptacja regulaminu -->


    <!-- przejdź dalej-->
    <button class="btn btn-lg btn-primary btn-block" type="submit">Zarejestruj</button>

</form>


</body>
</html>
