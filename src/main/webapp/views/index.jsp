<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Schedule List</title>
</head>
<body>
<h1>Schedule List</h1>
<ul>
    <c:forEach var="schedule" items="${schedules}">
        <li>
            <a href="detail?id=${schedule.id}">
                    ${schedule.time} - ${schedule.roomNumber} (${schedule.dayOfWeek})
            </a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
