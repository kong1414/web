package com.kongww.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 22:28 2018/10/7
 */
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println(" <font color = '#0000ff'>");
        out.println("<h3>Hello,World!</h3>");
        out.println("The time now is:"+new java.util.Date());
        out.println("</body>");
        out.println("</html>");

    }
}
