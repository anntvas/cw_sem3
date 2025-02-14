<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id = wrapper>
    <div id = header align="center">
        <h1>Информация о занятии</h1>
    </div>
    <div align="center">
        <p>
            <strong><label>Номер аудитории:</label></strong>
            ${schedule.getRoom()}
        </p>
        <p>
            <strong><label>Время:</label></strong>
            ${schedule.getTime()}
        </p>
        <p>
            <strong><label>День недели:</label></strong>
            ${schedule.getWeekday()}
        </p>
        <p>
            <strong><label>Преподаватель:</label></strong>
            ${schedule.getTeacher()}
        </p>
        <p>
            <strong><label>Группа:</label></strong>
            ${schedule.getGroupNumber()}
        </p>
        <button type="button" onclick="location.href = '${pageContext.servletContext.contextPath}/'">Back</button>
    </div>
</div>
</body>
</html>
