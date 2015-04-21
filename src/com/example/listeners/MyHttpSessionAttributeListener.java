package com.example.listeners;

import javax.servlet.*;
import javax.servlet.http.*;
import com.example.util.Logger;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent event) {
        
        String name = event.getName();
        Object value = event.getValue();

        Logger.log("Attribute added - "
                    + name
                    + " : "
                    + value, getClass());
    }
    
    public void attributeReplaced(HttpSessionBindingEvent event) {
        
        String name = event.getName();
        Object value = event.getValue();

        Logger.log("Attribute replaced - "
                    + name
                    + " : "
                    + value, getClass());
    }

    public void attributeRemoved(HttpSessionBindingEvent event) {
        
        String name = event.getName();
        Object value = event.getValue();

        Logger.log("Attribute removed - "
                    + name
                    + " : "
                    + value, getClass());
    }
}

