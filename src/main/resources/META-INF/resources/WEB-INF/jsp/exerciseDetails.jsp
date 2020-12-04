<%--
  Created by IntelliJ IDEA.
  User: krzysztof
  Date: 01.12.2020
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Exercise Details</title>
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

<div>
    <br>
    <h3>Sczegóły ćwiczenia:</h3>
    <br>
    Nazwa ćwiczenia: ${exercise.name}<br/>
    Ilość seri: ${exercise.sets}<br/>
    Ilość powtórzeń: ${exercise.reps}<br/>
    Ciężar: ${exercise.weights}<br/>
</div>


</body>
</html>
