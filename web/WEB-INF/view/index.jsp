<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 01.12.2018
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <title>Witaj</title>
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/jumbotron.css" rel="stylesheet">

</head>
<body>
<main role="main">

    <c:choose>
        <c:when test="${not empty sessionScope.user}">
            <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                <a class="navbar-brand" href="#">Legia Akademicka UKW</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#">Jesteś zalogowany</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/logout">Wyloguj się</a>
                        </li>
                    </ul>

                </div>
            </nav>
            <div class="container">
                <!-- Adding new stuff -->
                <div class="row">
                    <div class="col-md-4">
                        <h2>Złóż nowe podanie</h2>
                        <p>Dodaj nowe podanie do swojego katalogu i już zawsze miej je pod ręką. </p>
                        <p><a class="btn btn-secondary" href="/proposal" role="button">Złóż Podanie &raquo;</a></p>
                    </div>
                    <div class="col-md-4">
                        <h2>Popraw Podanie</h2>
                        <p>Wprowadziłeś błędne dane lub te już podane się zmieniły? Żaden problem podanie możesz poprawić w tym miejscu. </p>
                        <p><a class="btn btn-secondary" href="/updateProposal" role="button">Popraw Podanie &raquo;</a></p>
                    </div>
                    <div class="col-md-4">
                        <h2>Dodaj informacje dotyczące treningu</h2>
                        <p>Po zakwalifikowaniu na trening dodaj więcej informacji, aby bez problemu uzyskać formę odpowiedniego podania. </p>
                        <p><a class="btn btn-secondary" href="/addTraining" role="button">Dodaj trening &raquo;</a></p>
                    </div>
                </div>

                <hr>

            </div> <!-- /container -->
            <div class="container">
                <!-- Getting stuff -->
                <div class="row">
                    <div class="col-md-4">
                        <h2>Pokaż podanie</h2>
                        <p>Wyświetl swoje podanie. </p>
                        <p><a class="btn btn-secondary" href="/proposalCatalog" role="button">Pokaż podanie &raquo;</a></p>
                    </div>
                    <div class="col-md-4">
                        <h2>Pokaż trening</h2>
                        <p>Wyświetl podanie dotyczące Twojego treningu. </p>
                        <p><a class="btn btn-secondary" href="/getTraining" role="button">Pokaż trening &raquo;</a></p>
                    </div>

                </div>

                <hr>

            </div> <!-- /container -->
            <div class="container">
                <!-- Static stuff -->
                <div class="row">
                    <div class="col-md-4">
                        <h2>Zarządzenie</h2>
                        <p>Wyświetl zarządzenie rektora dotyczące Legii Akademickiej UKW. </p>
                        <p><a class="btn btn-secondary" href="/ordinance" role="button">Zarządzenie &raquo;</a></p>
                    </div>
                    <div class="col-md-4">
                        <h2>Plan zajęć</h2>
                        <p>Pokaż plan zajęć Legii Akademickiej UKW na najbliższy rok. </p>
                        <p><a class="btn btn-secondary" href="/schedule" role="button">Plan zajęć &raquo;</a></p>
                    </div>
                    <div class="col-md-4">
                        <h2>Regulamin</h2>
                        <p>Pokaż regulamin Legii Akademickiej UKW.</p>
                        <p><a class="btn btn-secondary" href="/statute" role="button">Regulamin &raquo;</a></p>
                    </div>
                </div>

                <hr>

            </div> <!-- /container -->

            <c:choose>
                <c:when test="${not empty sessionScope.admin}">
                   <p>Admin</p>
                    <div class="container">
                        <!-- Admin stuff -->

                            <div class="col-md-4">
                                <h2>Wyślij wiadomości</h2>
                                <p>Wyślij maila tej samej treści do wszystkich członków szkolenia.</p>
                                <p><a class="btn btn-secondary" href="/MoveToMail" role="button">Przejdź &raquo;</a></p>
                            </div>
                        </div>

                        <hr>

                    </div> <!-- /container -->


                </c:when>
            </c:choose>

        </c:when>
        <c:otherwise>
            <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                <a class="navbar-brand" href="#">Legia Akademicka UKW</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarsExampleDefaultAdmin">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#">Jesteś nie zalogowany</a>
                        </li>
                    </ul>
                </div>
            </nav>
            <div class="jumbotron">
                <div class="container">
                    <h1 class="display-3">Witaj na stronie lgii iaiaiaisiciekj uww</h1>
                    <p>Zaloguj się aby w pełni korzystać ze strony, jeśli nie masz jeszcze konta, zarejestruj się. </p>
                    <p><a class="btn btn-primary btn-lg" href="/login" role="button">Zaloguj się &raquo;</a></p>
                    <p><a class="btn btn-primary btn-lg" href="/register" role="button">Zarejestruj się &raquo;</a></p>
                </div>
            </div>

        </c:otherwise>
    </c:choose>
</main>
<footer class="container">
    <p>&copy; Fabian 2019</p>
</footer>
</body>
</html>

