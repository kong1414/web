package com.kongww.web.servlet;

import com.kongww.web.pojo.model.Student;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 23:33 2018/10/7
 */
public class SecondServlet extends HttpServlet {
    ServletContext context;

    @Override
    public void init() {
        context = getServletContext();
    }

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        Student stud = (Student) request.getAttribute("stud");

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<center>");
        out.println("学号：" + stud.getSnumber() + "<br>");
        out.println("姓名：" + stud.getSname() + "<br>");
        out.println("<a href=\"/helloapp/input.html\">返回输入页面</a>");
        out.println("</center>");
        out.println("</body></html>");
    }

}
