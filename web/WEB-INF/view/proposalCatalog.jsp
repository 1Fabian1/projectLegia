<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 24.01.2019
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Katalog podań</title>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/icons/rsz_ukw.png">
    <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">
</head>
<body>
Katalog podań<br><br>
<c:forEach var="proposal" items="${proposals}">


    Imię: <c:out value="${proposal.firstName}"/><br>
    Drugie Imię: <c:out value="${proposal.secondName}"/><br>
    Nazwisko: <c:out value="${proposal.surname}"/><br>
    Obywatelstwo: <c:out value="${proposal.citizenship}"/><br>
    Data urodzenia: <c:out value="${proposal.birthDate}"/><br>
    Miejsce urodzenia: <c:out value="${proposal.birthPlace}"/><br>
    PESEL: <c:out value="${proposal.PESEL}"/><br>
    Adres zamieszkania: <c:out value="${proposal.addressOfStay}"/><br>
    Adres do korespondencji: <c:out value="${proposal.addressOfCorrespondence}"/><br>
    Numer telefonu: <c:out value="${proposal.phoneNumber}"/><br>
    Nazwa uniwersytetu: <c:out value="${proposal.universityName}"/><br>
    Wydział uniwersytetu: <c:out value="${proposal.universityFaculty}"/><br>
    Kierunek studiów: <c:out value="${proposal.fieldOfStudy}"/><br>
    Rok studiów: <c:out value="${proposal.yearOfStudy}"/><br>
    Planowany rok ukończenia: <c:out value="${proposal.plannedYearOfGraduation}"/><br>
    Kategoria zdrowia: <c:out value="${proposal.healthCategory}"/><br>

    <br>

</c:forEach>



<br>
<a href="/mainPage">Wróć na stronę główną</a>
</body>
</html>
