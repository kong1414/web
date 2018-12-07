<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.io.DataInputStream" %>
<%@ page import="static jdk.nashorn.internal.objects.NativeMath.log" %>
<%@ page import="java.io.DataOutputStream" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.io.FileOutputStream" %>
<%!
    int count = 0;
    String dbPath;

    public void jspInit() {
        try {
            dbPath = getServletContext().getRealPath("/WEB-INF/counter.db");
            FileInputStream fis = new FileInputStream(dbPath);
            DataInputStream dis = new DataInputStream(fis);
            count = dis.readInt();
            dis.close();
        } catch (Exception e) {
            log("Error loading persistent counter", e);
        }
    }
%>
<%--下面是向浏览器输出的主要内容，
它将成为产生的_jspService()方法的一部分
--%>
<html>
<body>
<% count++; %>
Welcome! You are  <%= count %> th visitor(s).
</body>
</html>
<%!
    public void jspDestroy() {
        try {
            FileOutputStream fos = new FileOutputStream(dbPath);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(count);
            dos.close();
        } catch (Exception e) {
            log("Error storing persistent counter", e);
        }
    }
%>
