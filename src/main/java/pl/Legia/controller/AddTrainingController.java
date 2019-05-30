package pl.Legia.controller;

import pl.Legia.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddTrainingController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("AddTrainingController - Post");

        request.setCharacterEncoding("UFT-8");
        User user = (User) request.getSession().getAttribute("user");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("AddTrainingController - Get");
        request.getRequestDispatcher("WEB-INF/view/addTraining.jsp").forward(request,response);

        System.out.println("principal:" + request.getUserPrincipal().toString());
    }
}
