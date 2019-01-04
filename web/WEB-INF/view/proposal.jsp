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

<form class="forma" method="POST" action="/proposal">
    <h1>Wypełnij wniosek</h1>
        Imię:
          <input type="text" name="first_name" required><br>
          Drugie imie(niewymagane):
            <input type="text" name="second_name"><br>
            Nazwisko:
              <input type="text" name="surname" required><br>
              Narodowość:
                <input type="text" name="citizenship" required><br>
                Data urodzenia:
                  <input type="date" name="birth_date" required><br>
                  Miejsce urodzenia:
                    <input type="text" name="birth_place" required><br>
                    Pesel:
                      <input type="text" name="PESEL" required><br>
                      Adres pobytu stałego:
                        <input type="text" name="address_of_stay" required><br>
                        Adres korespondencyjny:
                          <input type="text" name="address_for_correspondence" required><br>
                          Numer telefonu:
                            <input type="text" name="phone_number" required><br>
                            Nazwa uczelni:
                              <input type="text" name="university_name" required><br>
                              Wydział uczelni:
                                <input type="text" name="university_faculty" required><br>
                                Kierunek studiów:
                                  <input type="text" name="field_of_study" required><br>
                                  Rok studiów:
                                    <input type="text" name="year_of_study" required><br>
                                    Planowany rok ukończenia studiów:
                                      <input type="text" name="planned_year_of_graduation" required><br>
                                      Orzeczona kategoria zdolności<br> do czynnej służby wojskowej:
                                        <input type="text" name="health_category" required><br>
                                          <input class="buttonZal" type="submit" value="wyślij">
                                        </form>                
                            
  </table>
</body>
</html>
