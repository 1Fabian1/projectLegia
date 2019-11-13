<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 02.12.2018
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <title>Wniosek</title>
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/signin.css" rel="stylesheet">
</head>
<body>

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

<form class="form-signin" action="/proposal" method="POST">
    <h1 class="h3 mb-3 font-weight-normal">Wypełnij wniosek</h1>

    <label for="inputName" class="sr-only">Imię</label>
    <input type="text" id="inputName" name="first_name" class="form-control" placeholder="Imię" required autofocus>

    <label for="inputSurname" class="sr-only">Nazwisko</label>
    <input type="text" id="inputSurname" name="surname" class="form-control" placeholder="Nazwisko" required autofocus>

    <label for="inputFatherName" class="sr-only">Imię ojca</label>
    <input type="text" id="inputFatherName" name="father_name" class="form-control" placeholder="Imię ojca" required autofocus>

    <label for="inputCitizenship" class="sr-only">Narodowość</label>
    <input type="text" id="inputCitizenShip" name="citizenship" class="form-control" placeholder="Narodowość" required autofocus>

    <p>Data urodzenia</p>
    <label for="inputBirthDate" class="sr-only">Data urodzenia</label>
    <input type="date" id="inputBirthDate" name="birth_date" class="form-control" placeholder="DataUrodzenia" required autofocus>

    <label for="inputBirthPlace" class="sr-only">Miejsce urodzenia</label>
    <input type="text" id="inputBirthPlace" name="birth_place" class="form-control" placeholder="Miejsce urodzenia" required autofocus>

    <label for="inputPesel" class="sr-only">PESEL</label>
    <input type="text" id="inputPesel" name="PESEL" class="form-control" placeholder="PESEL" required autofocus>

    <label for="inputAddressOfStay" class="sr-only">Adres pobytu stałego</label>
    <input type="text" id="inputAddressOfStay" name="address_of_stay" class="form-control" placeholder="Adres pobytu stałego" required autofocus>

    <label for="inputCorrespondenceAddress" class="sr-only">Adres korenspondencyjny</label>
    <input type="text" id="inputCorrespondenceAddress" name="address_for_correspondence" class="form-control" placeholder="Adres korespondencyjny" required autofocus>

    <label for="inputPhoneNumber" class="sr-only">Numer telefonu</label>
    <input type="text" id="inputPhoneNumber" name="phone_number" class="form-control" placeholder="Numer telefonu" required autofocus>

    <label for="inputUniversityName" class="sr-only">Nazwa uczelni</label>
    <input type="text" id="inputUniversityName" name="university_name" class="form-control" placeholder="Nazwa uczelni" required autofocus>

    <label for="inputUniversityFaculty" class="sr-only">Wydział uczelni</label>
    <input type="text" id="inputUniversityFaculty" name="university_faculty" class="form-control" placeholder="Wydział uczelni" required autofocus>

    <label for="inputFieldOfStudy" class="sr-only">Kierunek Studiów</label>
    <input type="text" id="inputFieldOfStudy" name="field_of_study" class="form-control" placeholder="Kierunek studiów" required autofocus>

    <label for="inputYearOfStudy" class="sr-only">Rok studiów</label>
    <input type="text" id="inputYearOfStudy" name="year_of_study" class="form-control" placeholder="Rok studiów" required autofocus>

    <label for="inputYearOfGraduation" class="sr-only">Planowany rok ukończenia studiów</label>
    <input type="text" id="inputYearOfGraduation" name="planned_year_of_graduation" class="form-control" placeholder="Planowany rok ukończenia studiów" required autofocus>

    <label for="inputHealthCategory" class="sr-only">Kategoria zdrowia</label>
    <input type="text" id="inputHealthCategory" name="health_category" class="form-control" placeholder="Kategoria zdrowia" required autofocus>

    <label for="inputCrimeRecord" class="sr-only">Byłem karany za przestępstwo umyślne</label>
    <input type="text" id="inputCrimeRecord" name="crime_record" class="form-control" placeholder="Byłem karany za przestępstwo umyślne" required autofocus>

    <label for="inputAlbumNumber" class="sr-only">Numer albumu</label>
    <input type="text" id="inputAlbumNumber" name="album_number" class="form-control" placeholder="Numer albumu" required autofocus>

    <button class="btn btn-lg btn-primary btn-block" type="submit">Wyślij</button>

</form>

</body>
</html>
