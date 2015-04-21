package com.example.listeners;

import javax.servlet.*;
import javax.servlet.http.*;
import com.example.util.Logger;

public class MySecondHttpSessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent event) {
        HttpSession session = event.getSession();

        StringBuilder builder = new StringBuilder();

        builder.append(session.getId());
        builder.append(" | ");
        builder.append(session.getMaxInactiveInterval());
        builder.append(" | ");
        builder.append(session.isNew());

        Logger.log("Session created - " + builder.toString(), getClass());
    }

    public void sessionDestroyed(HttpSessionEvent event) {
        HttpSession session = event.getSession();

        StringBuilder builder = new StringBuilder();

        builder.append(session.getId());
        builder.append(" | ");
        builder.append(session.getMaxInactiveInterval());

        Logger.log("Session destroyed - " + builder.toString(), getClass());

    }
}

