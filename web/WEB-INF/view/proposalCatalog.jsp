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
<c:forEach var="iterator" varStatus="number" items="1">
    <c:forEach var="proposal" items="${proposals}">
        <div>
            <table class="showProposal" border = "1">
                <tr>
                    <td>Imię: </td> <td> <c:out value="${proposal.firstName}"/></td>
                </tr>    
                <tr>                       
                       <td> Drugie Imię:</td><td> <c:out value="${proposal.secondName}"/></td>
                    </tr>
                    <tr>
                        <td> Nazwisko: </td> <td> <c:out value="${proposal.surname}"/></td>
                    </tr>
                    <tr>
                        
                        <td> Obywatelstwo: </td> <td> <c:out value="${proposal.citizenship}"/> </td>
                    </tr>
                    <tr>
                        <td> Data urodzenia: </td> <td> <c:out value="${proposal.birthDate}"/></td>
                    </tr>
                    <tr>
                        <td> Miejsce urodzenia: </td> <td> <c:out value="${proposal.birthPlace}"/></td>
                    </tr>
                    <tr>
                        <td> PESEL: </td> <td> <c:out value="${proposal.PESEL}"/> </td>
                    </tr>
                    <tr>
                        <td>Adres zamieszkania: </td> <td> <c:out value="${proposal.addressOfStay}"/></td>
                    </tr>
                    <tr>
                        <td> Adres do korespondencji: </td> <td> <c:out value="${proposal.addressOfCorrespondence}"/></td>
                    </tr>
                    <tr>
                       <td> Numer telefonu: </td> <td> <c:out value="${proposal.phoneNumber}"/></td>
                    </tr>
                    <tr>
                        <td> Nazwa uniwersytetu: </td> <td> <c:out value="${proposal.universityName}"/> </td>
                    </tr>
                    <tr>
                       <td> Wydział uniwersytetu: </td> <td> <c:out value="${proposal.universityFaculty}"/></td>
                    </tr>
                    <tr>
                       <td> Kierunek studiów: </td> <td> <c:out value="${proposal.fieldOfStudy}"/> </td>
                    </tr>
                    <tr>
                        <td> Rok studiów: </td> <td> <c:out value="${proposal.yearOfStudy}"/> </td>
                    </tr>
                    <tr>
                        <td> Planowany rok ukończenia: </td> <td> <c:out value="${proposal.plannedYearOfGraduation}"/></td>
                    </tr>
                    <tr>
                        <td> Kategoria zdrowia: </td><td> <c:out value="${proposal.healthCategory}"/></td>
                    </tr>
            </table>
            <br>
        </div>
        <c:set var="iterator" value="${iterator+1}"/>
    </c:forEach>
</c:forEach>
<br>
<a href="/mainPage">Wróć na stronę główną</a>
</body>
</html>
