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
    <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">
</head>
<body>
    <div>
        <nav>
            <ul>
                    <li><a href=mainPage.jsp>Strona Domowa</a></li>
                    <li><a href="/proposal">Wniosek</a></li>
                    <li><a href="/logout">Wyloguj</a></li>
            </ul>
    </nav>
</div>
<h1>Witaj na stronie głównej</h1>
<br>
sesionScope.size: <c:out value="${sessionScope.size()}"/><br>
sesionScope.values: <c:out value="${sessionScope.values()}"/><br>

Hello ${sessionScope.User}<br>



<a href="/proposal">Podanie</a>
<a href="/logout">Wyloguj</a>

</body>
</html>
