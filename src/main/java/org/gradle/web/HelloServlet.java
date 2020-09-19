package org.gradle.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/index"})
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("<h1>Aplicação Web</h1> </br> "
                + "Gustavo Robert - RA:1460481821035 </br> "
                + "Laboratório de engenharia de software - Prof. Fabrício Galende");  
    }
}