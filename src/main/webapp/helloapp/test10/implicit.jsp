<%@ page contentType="text/html;charset=gb2312" %>
<html>
<head>
    <title>EL implicit objects</title>
</head>
<body>
<h1>JSP 2.0 ���ʽ����-��������</h1>
<hr>
<blockquote>
    <b>����foo����ֵ</b>
    <form action="implicit.jsp" method="GET">
        foo= <input type="text" name="foo" value="${param["foo"]}">
        <input type="submit">
    </form>
    <br>
    <code>
        <table border="1">
            <thead>
            <td><b>EL ���ʽ</b></td>
            <td><b>���</b></td>
            </thead>
            <tr>
                <td>\${param.foo}</td>
                <td>${param.foo}&nbsp;</td>
            </tr>
            <tr>
                <td>\${param["foo"]}</td>
                <td>${param["foo"]}&nbsp;</td>
            </tr>
            <tr>
                <td>\${header["host"]}</td>
                <td>${header["host"]}</td>
            </tr>
            <tr>
                <td>\${header["accept"]}</td>
                <td>${header["accept"]}</td>
            </tr>
            <tr>
                <td>\${header["user-agent"]}</td>
                <td>${header["user-agent"]}</td>
            </tr>
        </table>
    </code>
</blockquote>
</body>
</html>
