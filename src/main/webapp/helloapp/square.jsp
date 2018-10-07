<%--
  Created by IntelliJ IDEA.
  User: QGL-XPS
  Date: 2018/10/7
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<table border=’1’ cellspacing=’0’ cellpadding=’5’>
    <tr>
        <% for (int i = 0; i < 10; i++) { %>
        <th><%= i %>
        </th>
        <% } %>
    </tr>
    <tr>
        <% for (int i = 0; i < 10; i++) { %>
        <td><%= (i * i) %>
        </td>
        <% } %>
    </tr>

</table>
</body>
</html>

