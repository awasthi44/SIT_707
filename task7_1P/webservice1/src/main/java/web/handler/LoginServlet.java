package web.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.service.LoginService;

/**
 * HTTP end-point to handle login service.
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String dob = req.getParameter("dob");

        boolean isAuthenticated = LoginService.login(username, password, dob);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if (isAuthenticated) {
            out.println("<html><head><title>success</title></head><body><h2>Login Successful</h2></body></html>");
        } else {
            out.println("<html><head><title>fail</title></head><body><h2>Login Failed</h2></body></html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Forward GET /login to index.html
    	RequestDispatcher dispatcher = req.getRequestDispatcher("/index.html");
    	dispatcher.forward(req, resp);
    }
}
