package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Index"})
public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        
            String pass1 = request.getParameter("password");
            String pass2 = request.getParameter("password2");   
            boolean val = false;
            if (pass1.equals(pass2))
                val = true;
            
            request.setAttribute("val", val);                
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
            
    }

}
