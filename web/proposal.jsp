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
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet">
</head>
<body>


<form method="POST" action="/proposal">
    <h1>Wypełnij wniosek</h1>
        Imię:
          <input type="text" name="first_name"><br>
          drugie imie:
            <input type="text" name="second_name"><br>
            Nazwisko:
              <input type="text" name="surname"><br>
              Narodowość:
                <input type="text" name="citizenship"><br>
                Data urodzenia:
                  <input type="date" name="birth_date"><br>
                  Miejsce urodzenia:
                    <input type="text" name="birth_place"><br>
                    Pesel:
                      <input type="text" name="PESEL"><br>
                      Adres pobytu stałego:
                        <input type="text" name="address_of_stay"><br>
                        Adres korespondencyjny:
                          <input type="text" name="address_for_correspondence"><br>
                          Numer telefonu:
                            <input type="text" name="phone_number"><br>
                            Nazwa uczelni:
                              <input type="text" name="university_name"><br>
                              Wydział uczelni:
                                <input type="text" name="university_faculty"><br>
                                Kierunek studiów:
                                  <input type="text" name="field_of_study"><br>
                                  Rok studiów:
                                    <input type="text" name="year_of_study"><br>
                                    Planowany rok ukończenia studiów:
                                      <input type="text" name="planned_year_of_graduation"><br>
                                      Orzeczona kategoria zdolności<br> do czynnej służby wojskowej:
                                        <input type="text" name="health_category"><br>
                                          <input type="submit" value="wyślij">
                                        </form>                
                            
  </table>
</body>
</html>
