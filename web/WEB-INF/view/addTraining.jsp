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
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/jumbotron.css" rel="stylesheet">
</head>
<body>

<form class="form-signin" action="/addTraining" method="POST">
    <h1 class="h3 mb-3 font-weight-normal">Uzupełnij informacje niezbędne do kolejnego podania</h1>

    <label for="inputMilitaryBook" class="sr-only">Numer książeczki wojskowej</label>
    <input type="text" id="inputMilitaryBook" name="MilitaryBookNumber" class="form-control" placeholder="Numer książeczki wojskowej" required autofocus>

    <label for="inputSubstantiation" class="sr-only">Uzasadnienie</label>
    <input type="text" id="inputSubstantiation" name="substantiation" class="form-control" placeholder="Uzasadnienie" required autofocus>

    <label for="inputQualifications" class="sr-only">Kwalifikacje</label>
    <input type="text" id="inputQualifications" name="qualifications" class="form-control" placeholder="Kwalifikacje" required autofocus>

    <label for="inputTheoreticalPart" class="sr-only">Część teoretyczna</label>
    <input type="text" id="inputTheoreticalPart" name="theoreticalPart" class="form-control" placeholder="Część teoretyczna" required autofocus>

    <label for="inputBasicModule" class="sr-only">Moduł podstawowy</label>
    <input type="text" id="inputBasicModule" name="basicModule" class="form-control" placeholder="Modół podstawowy" required autofocus>

    <label for="inputPreOfficerModule" class="sr-only">Modół pod oficerski</label>
    <input type="text" id="inputPreOfficerModule" name="preOfficerModule" class="form-control" placeholder="Modół pod oficerski" required autofocus>

    <label for="inputTrainingPlace" class="sr-only">Miejsce treningu</label>
    <input type="text" id="inputTrainingPlace" name="trainingPlace" class="form-control" placeholder="Miejsce treningu" required autofocus>

    <label for="inputUniversityAddress" class="sr-only">Adres uczelni</label>
    <input type="text" id="inputUniversityAddress" name="universityAddress" class="form-control" placeholder="Adres uczelni" required autofocus>


    <button class="btn btn-lg btn-primary btn-block" type="submit">Dodaj informacje</button>

</form>

</body>
</html>
