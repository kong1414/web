<%@ page contentType="text/html;charset=gb2312" %>
<html>
<head><title>Listener test</title>
</head>
<body>
��ӭ��������IP��ַ��<%= request.getRemoteAddr() %>
<p>��Ӧ�ó���������������ҳ�汻������
    <font color="blue"><%=application.getAttribute("count")%>
    </font>��<br>
</body>
</html>
