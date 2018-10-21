package com.kongww.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 0:14 2018/10/22
 */
@WebListener
public final class MyRequestListener
        implements ServletRequestListener {
    private int count = 0;

    @Override
    public void requestInitialized(ServletRequestEvent re) {
        HttpServletRequest request =
                (HttpServletRequest) re.getServletRequest();
        if (request.getRequestURI().equals("/helloapp/onlineCount.jsp")) {
            count++;
            re.getServletContext().setAttribute("count", new Integer(count));
        }
    }

    public void requestDestroyed(ServletRequestEvent re) {
    }
}
