package com.kongww.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 23:21 2018/10/7
 */
public class ShowHeadersServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>All Headers</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"#fdf5e6\">");
        out.println("<h1 align=\"center\">All Request Headers</h1>");
        out.println("<table border=1 align=\"center\">\n" +
                "<tr bgcolor=\"#ffad00\">\n" +
                "<th>Header Name<th>Header Value");
        Enumeration headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            out.println("<tr><td>" + headerName);
            out.println("<td>" + req.getHeader(headerName));
        }
        out.println("</table>\n</body></html>");

    }
}
