package pl.Legia.controller;

import pl.Legia.model.Training;
import pl.Legia.model.User;
import pl.Legia.serviceLayer.TrainingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddTrainingController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("AddTrainingController - Post");



//        request.setCharacterEncoding("UFT-8");
        User user = (User) request.getSession().getAttribute("user");
//        Training training = new Training();

        User loggedUser = (User) request.getSession().getAttribute("user");

        String militaryBookNumber = request.getParameter("MilitaryBookNumber");
        String substantiation = request.getParameter("substantiation");
        String qualifications = request.getParameter("qualifications");
        String theoreticalPart = request.getParameter("theoreticalPart");
        String basicModule = request.getParameter("basicModule");
        String preOfficerModule = request.getParameter("preOfficerModule");
        String trainingPlace = request.getParameter("trainingPlace");
        String universityAddress = request.getParameter("universityAddress");
        long user_id = loggedUser.getUser_id();

        System.out.println("ADD THIS TRAININIG INFO: "+qualifications + " usrID:" + user_id);

        TrainingService trainingService = new TrainingService();
        trainingService.addTraining(militaryBookNumber,substantiation,qualifications,theoreticalPart,basicModule,preOfficerModule,
                trainingPlace,universityAddress,user_id);
        response.setStatus(307);
        response.sendRedirect(request.getContextPath() + "/mainPage");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("AddTrainingController - Get");
        request.getRequestDispatcher("WEB-INF/view/addTraining.jsp").forward(request,response);

        System.out.println("principal:" + request.getUserPrincipal().toString());
    }
}
