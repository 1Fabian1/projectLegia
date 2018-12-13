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
<form method="POST" action = "/register">
    <img src="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png" alt="" width="250"
         height="220">
    <h1>Zarejestruj się</h1>
        <input type="text" name="inputUsername" placeholder="Nazwa użytkownika" required autofocus></p>
        <input type="password" name="inputPassword" placeholder="Hasło" required></p>
        <input type="email" name="inputEmail" placeholder="Email address" required autofocus></p>
        <button type="submit">Zarejestruj</button>

</form>
</body>
</html>
