<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <title>JSP 2.0 Expression Language - Basic Arithmetic</title>
</head>
<body>
<h1>JSP 2.0 表达式语言 - 基本算术运算符</h1>
<hr>
该例说明了基本的表达式语言的算术运算符的使用，其中包括加(+),减(-), 乘(*),除(/ 或 div), 取余 (% 或 mod)。
<br>
<blockquote>
    <code>
        <table border="1">
            <thead>
            <td><b>EL 表达式</b></td>
            <td><b>结果</b></td>
            </thead>
            <tr>
                <td>\${1}</td>
                <td>${1}</td>
            </tr>
            <tr>
                <td>\${1 + 2}</td>
                <td>${1 + 2}</td>
            </tr>
            <tr>
                <td>\${1.2 + 2.3}</td>
                <td>${1.2 + 2.3}</td>
            </tr>
            <tr>
                <td>\${1.2E4 + 1.4}</td>
                <td>${1.2E4 + 1.4}</td>
            </tr>
            <tr>
                <td>\${-4 - 2}</td>
                <td>${-4 - 2}</td>
            </tr>
            <tr>
                <td>\${21 * 2}</td>
                <td>${21 * 2}</td>
            </tr>
            <tr>
                <td>\${3/4}</td>
                <td>${3/4}</td>
            </tr>
            <tr>
                <td>\${3 div 4}</td>
                <td>${3 div 4}</td>
            </tr>
            <tr>
                <td>\${3/0}</td>
                <td>${3/0}</td>
            </tr>
            <tr>
                <td>\${10%4}</td>
                <td>${10%4}</td>
            </tr>
            <tr>
                <td>\${10 mod 4}</td>
                <td>${10 mod 4}</td>
            </tr>
            <tr>
                <td>\${(1==2) ? 3 : 4}</td>
                <td>${(1==2) ? 3 : 4}</td>
            </tr>
        </table>
    </code>
</blockquote>
</body>
</html>
