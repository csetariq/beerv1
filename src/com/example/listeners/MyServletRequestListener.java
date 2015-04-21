package com.example.listeners;

import com.example.util.Logger;
import javax.servlet.*;

public class MyServletRequestListener implements ServletRequestListener {
    public void requestInitialized(ServletRequestEvent event) {
        ServletRequest request = event.getServletRequest();
        String message = request.getRemoteAddr()
                            + ":"
                            + request.getRemotePort();
        Logger.log("Request came in " + message, getClass());
    }

    public void requestDestroyed(ServletRequestEvent event) {
        ServletRequest request = event.getServletRequest();
        String message = request.getRemoteAddr()
                            + ":"
                            + request.getRemotePort();
        Logger.log("Request destroyed " + message, getClass());

    }
}

