package com.kongww.web.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.util.Date;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 0:02 2018/10/22
 */
@WebListener
public final class MyServletContextListener
        implements ServletContextListener, ServletContextAttributeListener {

    private ServletContext context = null;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        context = sce.getServletContext();
        context.log("应用程序已启动：" + new Date());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        context = sce.getServletContext();
        context.log("应用程序已关闭：" + new Date());
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent sce) {
        context = sce.getServletContext();
        context.log("添加一个属性：" + sce.getName() + "：" + sce.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent sce) {
        context = sce.getServletContext();
        context.log("删除一个属性：" + sce.getName() + "：" + sce.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent sce) {
        context = sce.getServletContext();
        context.log("替换一个属性：" + sce.getName() + "：" + sce.getValue());
    }
}
