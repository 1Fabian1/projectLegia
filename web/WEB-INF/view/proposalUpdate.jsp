<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 25.01.2019
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <title>Popraw wniosek</title>
    <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">
</head>
<body>
<div>
    <nav>
        <ul>
            <li><a href="/mainPage">Strona Domowa</a></li>
            <li><a href="/logout">Wyloguj</a></li>
        </ul>
    </nav>
</div>

<form class="forma" method="POST" action="/updateProposal">
    <h1>Popraw wniosek</h1>
    Imię:
    <input type="text" name="first_name" maxlength="45" placeholder="Jan" required><br>
    Drugie imie(niewymagane):
    <input type="text" name="second_name" maxlength="45" placeholder="Adam" ><br>
    Nazwisko:
    <input type="text" name="surname" maxlength="45" placeholder="Kowalski" required><br>
    Narodowość:
    <input type="text" name="citizenship"  maxlength="45" placeholder="Polska" required><br>
    Data urodzenia:
    <input type="date" name="birth_date" placeholder="1900-01-01" min="1900-01-01" required><br>
    Miejsce urodzenia:
    <input type="text" name="birth_place" maxlength="45" placeholder="ul. Uliczna, 00-000 Miejscowość" required><br>
    Pesel:
    <input type="text" name="PESEL" maxlength="11" placeholder="12345678901" required><br>
    Adres pobytu stałego:
    <input type="text" name="address_of_stay" maxlength="150" placeholder="ul. Uliczna, 00-000 Miejscowość" required><br>
    Adres korespondencyjny:
    <input type="text" name="address_for_correspondence" maxlength="150" placeholder="ul. Uliczna, 00-000 Miejscowość" required><br>
    Numer telefonu:
    <input type="text" name="phone_number" maxlength="15" placeholder="111222333" required><br>
    Nazwa uczelni:
    <input type="text" name="university_name" maxlength="100" placeholder="Uniwersytet Kazimierza Wielkiego" required><br>
    Wydział uczelni:
    <input type="text" name="university_faculty" maxlength="45" placeholder="IMIS" required><br>
    Kierunek studiów:
    <input type="text" name="field_of_study" maxlength="100" placeholder="Informatyka" required><br>
    Rok studiów:
    <input type="text" name="year_of_study" maxlength="4" placeholder="2" required><br>
    Planowany rok ukończenia studiów:
    <input type="text" name="planned_year_of_graduation" maxlength="4" placeholder="2020" required><br>
    Orzeczona kategoria zdolności<br> do czynnej służby wojskowej:
    <input type="text" name="health_category" maxlength="4" placeholder="A" required><br>
    <input class="buttonZal" type="submit" value="wyślij">
</form>

</table>
</body>
</html>
