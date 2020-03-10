package pl.Legia.controller;

import pl.Legia.serviceLayer.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("RegisterController - Post");
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("inputUsername");
        String password = request.getParameter("inputPassword");
        String email = request.getParameter("inputEmail");
        System.out.println(username + " " + password + " " + email);
        UserService userService = new UserService();
        userService.addUser(username, password, email);
        response.sendRedirect(request.getContextPath() + "/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("RegisterController - get");
        request.getRequestDispatcher("WEB-INF/view/register.jsp").forward(request, response);
    }
}
