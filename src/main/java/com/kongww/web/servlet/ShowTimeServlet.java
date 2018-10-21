package com.kongww.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 23:32 2018/10/21
 */
@WebServlet("/helloapp/shuaxin.do")
public class ShowTimeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=gb2312");
        response.setHeader("refresh", "2");

        PrintWriter out = response.getWriter();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
        String s = sdf.format(date);

        out.println("<html>");
        out.println("<body>");
        out.println("<h3 align=\"center\">每5秒钟刷新一次页面</h3><p>");
        out.println("<h3 align=\"center\">现在的时间是：" + s + "</h3><p>");

        out.println("</body>");
        out.println("</html>");
    }
}

