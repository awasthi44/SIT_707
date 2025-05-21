package web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import web.handler.LoginServlet;
import web.handler.RegistrationServlet;
import web.handler.WelcomeServlet;

public class MyServer {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting server on http://127.0.0.1:8082...");

        Server server = new Server(8082);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        // Serve static files from src/main/resources/pages
        context.setResourceBase("src/main/resources/pages");
        context.setWelcomeFiles(new String[] { "index.html" });

        // Register servlets
        context.addServlet(WelcomeServlet.class, "/");
        context.addServlet(LoginServlet.class, "/login");
        context.addServlet(RegistrationServlet.class, "/reg");

     // Serve static content with Jetty's DefaultServlet (Jetty 8 compatible)
        ServletHolder defaultServlet = new ServletHolder(DefaultServlet.class);
        defaultServlet.setName("default");
        context.addServlet(defaultServlet, "/");
        server.setHandler(context);

        server.start();
        System.out.println("Server started successfully at http://127.0.0.1:8082/");
        server.join();
    }
}
