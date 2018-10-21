package com.kongww.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 0:12 2018/10/22
 */
@WebListener
public final class MySessionListener
        implements HttpSessionListener {
    private int count = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        se.getSession().getServletContext().setAttribute(
                "onlineCount", new Integer(count));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
        se.getSession().getServletContext().setAttribute(
                "onlineCount", new Integer(count));
    }
}
