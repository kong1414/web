<%@ page contentType="text/html;charset=gb2312" %>
<%
    String userName = request.getParameter("userName");
    String welcomeStr = "��ӭ���ٱ�վ";
    welcomeStr = userName + "," + welcomeStr;
    out.print(welcomeStr);
%>
