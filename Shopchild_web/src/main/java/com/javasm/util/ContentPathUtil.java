package com.javasm.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContentPathUtil implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String contextPath = servletContext.getContextPath();
        servletContext.setAttribute("ctx",contextPath);
        System.out.println("项目根路径"+contextPath);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
