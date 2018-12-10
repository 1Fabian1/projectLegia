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
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">

    <title>Zarejestruj się</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/resources/css/singin.css" rel="stylesheet">

</head>
</head>
<body class="text-center">
<form class="form-signin">
    <img class="mb-4" src="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png" alt="" width="250"
         height="220">
    <h1 class="h3 mb-3 font-weight-normal">Zarejestruj się</h1>
    <p><label for="InputUsername" class="sr-only">username</label>
        <input type="text" id="inputUsername" class="form-control" placeholder="Nazwa użytkownika" required autofocus></p>

    <p><label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Hasło" required></p>

    <p><label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus></p>



    <a class="btn btn-large btn-block btn-default" href="index.jsp" role="button">Zarejstruj się</a>
</form>
</body>
</html>
