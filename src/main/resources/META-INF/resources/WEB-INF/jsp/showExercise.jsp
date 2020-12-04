<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: krzysztof
  Date: 01.12.2020
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ćwiczenia</title>
</head>
<body>
<table border="1">
    <tbody>
    <tr>
        <td><a href="http://localhost:8080/addExercise">Login</a></td>
        <td><a href="http://localhost:8080/addUser">Zarejestruj</a></td>
        <td><a href="http://localhost:8080/showExercise">Ćwiczenia</a></td>
    </tr>
    </tbody>
</table>
<br>
<div><button> <a href="http://localhost:8080/addExercise">Dodaj ćwiczenie</a></button></div>
<h2>Lista Ćwiczeń:</h2>
<br>
<table border="1">
    <thead>
    <tr>
        <th>Id</th>
        <th>Nazwa ćwiczenia</th>
    </tr>
    </thead>
<c:forEach items="${exercise}" var="e">
        <tbody>
        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td><a href="http://localhost:8080/deleteExercise/${e.id}">delete</a></td>
            <td><a href="http://localhost:8080/showExercise/${e.id}">show</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>
