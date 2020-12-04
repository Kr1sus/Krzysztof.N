<%--
  Created by IntelliJ IDEA.
  User: krzysztof
  Date: 01.12.2020
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register</title>
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
<h2>Dodaj Użytkownika:</h2><br>
<form:form method="post" modelAttribute="userEntity">
    <div>
        <label for="username">Nazwa użytkownika</label><br>
        <form:input path="username" min="2"/>
        <form:errors path="username"/>
    </div>
    <div>
        <label for="password">Hasło</label><br>
        <form:input path="password"/>
        <form:errors path="password"/>
    </div>
    <input type="submit" value="Zarejestruj">
</form:form>
</body>
</html>
