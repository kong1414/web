<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib prefix="demo" uri="http://www.mydomain.com/function" %>
<html>
<head><title>Using Function </title></head>
<body>
<h3>������������֮��</h3>
<p>
<form action="sum.jsp" method="post">
    X = <input type="text" name="x" size="5"/>
    Y = <input type="text" name="y" size="5"/>
    <input type="submit" value="����">
</form>
<p>
    ���������ĺ�Ϊ��${demo:add(param["x"],param["y"])}
</body>
</html>
