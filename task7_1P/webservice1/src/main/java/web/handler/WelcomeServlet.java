package web.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("[WelcomeServlet] GET");

        resp.setContentType("text/plain");
        resp.getWriter().println("Welcome, server is running!");
    }

    // Optional: Remove doPost if not used, or keep it in case POSTs hit root URL
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp); // Reuse doGet logic
    }
}
