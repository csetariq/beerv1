package com.example.listeners;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.example.model.Dog;
import com.example.util.Logger;

public class MyContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        String dogBreed = ctx.getInitParameter("breed");

        Dog dog = new Dog(dogBreed);

        ctx.setAttribute("dog", dog);
        
        Logger.log("contextInitialized", getClass());
    }

    public void contextDestroyed(ServletContextEvent event) {
        Logger.log("contextDestroyed", getClass());
    }
}

