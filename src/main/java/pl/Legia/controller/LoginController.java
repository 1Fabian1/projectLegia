package pl.Legia.controller;

import pl.Legia.model.User;
import pl.Legia.serviceLayer.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoginController - Post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        saveUserInSession(request);
        System.out.println("LoginController - Get");
        if (request.getUserPrincipal() != null) {
            response.sendRedirect(request.getContextPath() + "/mainPage.jsp");
        } else {
            response.sendError(403);
        }
        HttpSession session = request.getSession(true);
        String username = String.valueOf(session.getAttribute("user"));
        System.out.println("user: "+username);
    }
    private void saveUserInSession(HttpServletRequest request) {
        UserService userService = new UserService();
        String username = request.getUserPrincipal().getName();
        User userByUsername = userService.getUserByUsername(username);
        request.getSession(true).setAttribute("user", userByUsername);
        System.out.println("Nazwa użytkownika: "+ userByUsername);
    }
}
