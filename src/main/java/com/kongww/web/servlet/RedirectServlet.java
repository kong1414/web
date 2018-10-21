package com.kongww.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 23:41 2018/10/21
 */
@WebServlet("/helloapp/login.do")
public class RedirectServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        if (name.equals("admin") && password.equals("admin")) {
            response.sendRedirect("welcome.html");
        } else {
            response.sendRedirect("error.html");
        }
    }
}
