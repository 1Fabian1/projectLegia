<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 01.12.2018
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">

    <title>Zaloguj się</title>
    <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">
</head>
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
    
<form action="j_security_check" method="POST">
    <h1 class="login"> Zaloguj się</h1>
        <input class="inputer" type="text" name="j_username" placeholder="Nazwa użytkownika" required autofocus></p>
        <input class="inputer" type="password" name="j_password" placeholder="Hasło" required></p>
        <button class="buttonZal" type="submit">Zaloguj</button><br>
        <p>Nie masz konta?</p><br>
        <a href="/register">Zarejestruj się</a>

</form>
</body>
</html>
