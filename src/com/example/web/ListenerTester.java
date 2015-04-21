package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.example.model.Dog;
import com.example.util.Logger;

public class ListenerTester extends HttpServlet {
    
    public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {
        HttpSession session = request.getSession();
        Logger.log("Session info - "
                    + " "
                    + session.getId()
                    + " "
                    + session.isNew()
                    + " "
                    + session.getMaxInactiveInterval(),
                    getClass());
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        Dog dog = (Dog) getServletContext().getAttribute("dog");

        out.println("Dog's breed is " + dog.getBreed());
        out.flush();
        out.close();
    }
}
