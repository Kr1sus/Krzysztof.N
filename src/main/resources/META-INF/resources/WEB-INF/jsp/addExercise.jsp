<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: krzysztof
  Date: 30.11.2020
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddExercise</title>
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
<h2>Dodaj ćwiczenie:</h2><br>
<form:form method="post" modelAttribute="exercise">
<div>
    <label for="name">Nazwa ćwiczenia</label><br>
    <form:input path="name"/>
</div>
    <div>
        <label for="sets">Ilość serii</label><br>
    <form:input path="sets"/>
    </div>
    <div>
        <label for="reps">Ilość powtórzeń</label><br>
        <form:input path="reps"/>
    </div>
    <div>
        <label for="reps">Ciężar</label><br>
        <form:input path="weights"/>
    </div>
    <input type="submit" value="Dodaj">
</form:form>
</body>
</html>
