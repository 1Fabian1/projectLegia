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
    <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">

</head>
</head>
<body >
        <div>
                <nav>
                    <ul>
                            <li><a href="/mainPage">Strona Domowa</a></li>
                            <li><a href="/register">Rejestracja</a></li>
                            <li><a href="/login">Logowanie</a></li>
                            <li><a href="/proposal">Wniosek</a></li>
                    </ul>
            </nav>
        </div>
<form method="POST" action = "/register">
    <h1>Zarejestruj się</h1>
        <a href="/regulations">Regulamin</a><br>
        <input type="checkbox" name="inputCheckbox" required>Akceptuję regulamin</p>
        <input type="text" name="inputUsername" placeholder="Nazwa użytkownika" maxlength="45" required autofocus><br>
        <input type="password" name="inputPassword" placeholder="Hasło" maxlength="45" required><br>
        <input type="email" name="inputEmail" placeholder="Email address" maxlength="100" required><br>

        <button type="submit">Zarejestruj</button>

</form>
</body>
</html>
