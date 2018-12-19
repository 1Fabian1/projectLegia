<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 17.12.2018
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona główna</title>
</head>
<body>
<h1>Witaj na stronie głównej</h1>
<br>
sesionScope.size: <c:out value="${sessionScope.size()}"/><br>
sesionScope.values: <c:out value="${sessionScope.values()}"/><br>

Hello ${param.userName}<br>



<a href="/proposal">Podanie</a>
<a href="/logout">Wyloguj</a>

</body>
</html>
