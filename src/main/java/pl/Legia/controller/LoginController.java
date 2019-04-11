package pl.Legia.controller;

import pl.Legia.model.User;
import pl.Legia.serviceLayer.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoginController - Post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        saveUserInSession(request);
        checkIfAdmin(request);
        System.out.println("LoginController - Get");
        if (request.getUserPrincipal() != null) {
            response.sendRedirect(request.getContextPath() + "/mainPage");
        } else {
            response.sendError(403);
        }
        HttpSession session = request.getSession(true);
        String username = String.valueOf(session.getAttribute("user"));
        System.out.println("user: " + username);
    }

    private void saveUserInSession(HttpServletRequest request) {
        UserService userService = new UserService();
        String username = request.getUserPrincipal().getName();
        User userByUsername = userService.getUserByUsername(username);
        request.getSession(true).setAttribute("user", userByUsername);
        System.out.println("Nazwa użytkownika: " + userByUsername);
    }

    private void checkIfAdmin(HttpServletRequest request) {
        System.out.println("Checking if admin");
        UserService userService = new UserService();
        String username = request.getUserPrincipal().getName();
        try {
            User adminByUsername = userService.checkIfAdmin(username);
            if (adminByUsername != null) {
                request.getSession(true).setAttribute("admin", adminByUsername);
                System.out.println("Nazwa administratora: " + adminByUsername);

                System.out.println("Lista użytkowników: ");
                List<User> allUsers = null;
                allUsers = userService.readAllUsersButLogged(username);
                System.out.println(allUsers.toString());
                request.getSession(true).setAttribute("allUsers",allUsers);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
