<%@ page contentType="text/html;charset=gb2312" %>
<%@ page isErrorPage="true" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.StringWriter" %>

<html>
<head><title>Exception Example</title></head>
<body>
<p>exception����ʹ��ʾ��</p>
<hr size='0'>
<font color="#ff0000" size="-1">
    �������������<br>
        <%
  exception.printStackTrace();
  StringWriter sout = new StringWriter();
  PrintWriter pout = new PrintWriter(sout);
  exception.printStackTrace(pout);
 %>
    <pre>
   <%= sout.toString() %>
 </pre>

</body>
</html>
