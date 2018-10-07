package com.kongww.web.servlet;

import com.kongww.web.pojo.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 23:32 2018/10/7
 */
public class FirstServlet extends HttpServlet {
    ServletContext context;

    @Override
    public void init() {
        context = getServletContext();
    }

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String snumber = request.getParameter("snumber");
        String sname = request.getParameter("sname");
        Student stud = new Student(snumber, sname);
        request.setAttribute("stud", stud);
        RequestDispatcher view =
                request.getRequestDispatcher("/secondservlet");
        view.forward(request, response);
    }
}
