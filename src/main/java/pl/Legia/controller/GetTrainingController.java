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

public class GetTrainingController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GetTrainingController - Get");

        User user;
        user = (User)  request.getSession().getAttribute("user");
        Training testTraining = new Training();
        TrainingService trainingService = new TrainingService();
        System.out.println("USER ID = "+ user.getUser_id());
        testTraining = trainingService.getTrainingByUserId(user.getUser_id());

        System.out.println(testTraining);

    }
}
