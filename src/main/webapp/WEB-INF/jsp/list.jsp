<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>List</title>
</head>
<body>
<div id = wrapper>
    <div id = header align="center">
        <h1>Расписание</h1>
    </div>
    <div align="center">
        <ul class = "list1a">
            <c:forEach var = "schedule" items="${list}" >
                <a href='${pageContext.servletContext.contextPath}/info?id=${schedule.getId()}'">
                    <p>
                        <strong><label>Преподаватель:</label></strong>
                            ${schedule.getTeacher()}
                        <strong><label>Время:</label></strong>
                            ${schedule.getTime()}
                    </p>
                </a>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>