package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body><h1 align=center>Beer Advice page</h1></body></html>");
    }

    public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws IOException, ServletException {
        log("BufferSize: " + response.getBufferSize());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int limit = Integer.valueOf(request.getParameter("limit"));

        for (int i = 0; i < limit; ++i) {
            out.write('$');
        }
        log("Done writing");
        /*
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            log("Interrupted", e);
        }
        */
    }
}
