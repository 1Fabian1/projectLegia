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
</head>
<body>

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
