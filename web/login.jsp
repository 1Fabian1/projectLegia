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
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet">
</head>
</head>
<body>
<form action="j_security_check" method="POST">
    <img src="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png" alt="" width="250" height="220">
    <h1> Zaloguj się</h1>
        <input type="text" name="j_username" placeholder="Nazwa użytkownika" required autofocus></p>
        <input type="password" name="j_password" placeholder="Hasło" required></p>
        <button type="submit">Zaloguj</button>

</form>
</body>
</html>
