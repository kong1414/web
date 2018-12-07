<%@ page contentType="text/html;charset=gb2312" %>

<html>
<head><title>Forward Test</title></head>
<body>
<jsp:forward page="forwardTo.jsp">
    <jsp:param name="userName" value="Hacker"/>
</jsp:forward>
</body>
</html>
