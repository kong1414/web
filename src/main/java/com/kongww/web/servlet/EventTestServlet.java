package com.kongww.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 0:04 2018/10/22
 */
@WebServlet("/eventtest")
public class EventTestServlet extends HttpServlet {
    ServletContext context = null;

    @Override
    public void init() {
        context = getServletConfig().getServletContext();
    }

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Event Test</title></head>");
        Integer anInteger = new Integer(100);
        Date aDate = new Date();
        context.setAttribute("obj", anInteger);
        //添加属性
        context.setAttribute("obj", aDate);
        //替换属性
        context.removeAttribute("obj");
        //删除属性
        out.println("<h3 align=center>" +
                "test ServletContext test</h3>");
        out.println("</body></html>");
        out.close();
    }

}
