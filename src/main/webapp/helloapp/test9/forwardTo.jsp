<%@ page contentType="text/html;charset=gb2312" %>
<%
    String userName = request.getParameter("userName");
    String welcomeStr = "»¶Ó­¹âÁÙ±¾Õ¾";
    welcomeStr = userName + "," + welcomeStr;
    out.print(welcomeStr);
%>
