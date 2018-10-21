package com.kongww.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 0:13 2018/10/22
 */
@WebServlet("/online")
public class OnlineCountServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException {
        HttpSession session = request.getSession(true);
        ServletContext context = getServletConfig().getServletContext();
        Integer count = (Integer) context.getAttribute("onlineCount");
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Session Event Test</title></head>");
        out.println("<h3 align=center><font color=\"#ff0000\">" +
                "当前在线人数：" + count + "</h3>");
        out.println("</body></html>");
        out.close();
    }
}
