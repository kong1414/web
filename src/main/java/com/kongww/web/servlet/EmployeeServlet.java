package com.kongww.web.servlet;

import com.kongww.web.pojo.EmployeeBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @version: 1.0
 */
@WebServlet("employee.do")
public class EmployeeServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String eno = request.getParameter("eno");
        String ename = request.getParameter("ename");
        String ecompany = request.getParameter("ecompany");
        EmployeeBean employee = new EmployeeBean();
        employee.setEno(eno);
        employee.setEname(ename);
        employee.setEcompany(ecompany);

        request.setAttribute("employee", employee);
        RequestDispatcher view =
                request.getRequestDispatcher("/displayEmployee.jsp");
        view.forward(request, response);
    }
}
