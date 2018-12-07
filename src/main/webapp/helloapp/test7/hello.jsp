<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="errorHandler.jsp" %>
<html>
<body>
<%
    String name = request.getParameter("name");
    if (name == null) {
        throw new RuntimeException("没有指定name 属性。");
    } else {
        // 将字符串name的字符编码转换为汉字编码
        name = new String(name.getBytes(StandardCharsets.ISO_8859_1), "gb2312");
    }
%>
Hello, <%=name %>
</body>
</html>
