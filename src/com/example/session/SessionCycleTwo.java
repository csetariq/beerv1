package com.example.session;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class SessionCycleTwo extends HttpServlet {

    private static Integer number = 2;

    public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws IOException, ServletException {
        HttpSession session = request.getSession();

        session.setAttribute("number", number++);
        request.setAttribute("name", getClass().getName());

        RequestDispatcher view = request.getRequestDispatcher("/sessionresult.jsp");
        view.forward(request, response);
    }
}

