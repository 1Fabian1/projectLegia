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
    <link href="${pageContext.request.contextPath}/resources/css/singin.css" rel="stylesheet">

</head>
</head>
<body >
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
<form method="POST" action = "/register">
    <h1>Zarejestruj się</h1>
        <input type="text" name="inputUsername" placeholder="Nazwa użytkownika" required autofocus></p>
        <input type="password" name="inputPassword" placeholder="Hasło" required></p>
        <input type="email" name="inputEmail" placeholder="Email address" required autofocus></p>
        <button type="submit">Zarejestruj</button>

</form>
</body>
</html>
