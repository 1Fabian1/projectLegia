<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 30.05.2019
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <title>Dodaj Trening</title>
    <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">
</head>
<body>

<form class="forma" method="POST" action="/addTraining">
    <h1>Dodaj niezbędne informacje</h1>
    Książeczka Wojskowa:
    <input type="text" name="militaryBookNumber" maxlenght="45" placeholder="12345" required><br>

</form>

</body>
</html>
