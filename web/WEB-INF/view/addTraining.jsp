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


    <label for="inputUniversityAddress" class="sr-only">Adres uczelni</label>
    <input type="text" id="inputUniversityAddress" name="universityAddress" class="form-control" placeholder="Adres uczelni" required autofocus>

    Termin odbycia modułu podstawowego
    <select name="basicModule" onChange="combo(this, 'theinput')">
        <option>Lipiec - Sierpień</option>
        <option>Sierpień - Wrzesień</option>
    </select>
    <br>

    Termin odbycia modułu podoficerskiego
    <select name="preOfficerModule" onChange="combo(this, 'theinput')">
        <option>Lipiec - Sierpień</option>
        <option>Sierpień - Wrzesień</option>
    </select>
    <br>

    Preferowane miejsce odbycia ćwiczeń jest JW(ośrodek szkolenia) usytuowany w pobliżu:
    <select name="trainingPlace" onChange="combo(this, 'theinput')">
        <option>Miejsca zamieszkania</option>
        <option>Siedziby uczelni</option>
        <option>Nie ma znaczenia</option>
    </select>



    <button class="btn btn-lg btn-primary btn-block" type="submit">Dodaj informacje</button>

</form>

</body>
</html>
