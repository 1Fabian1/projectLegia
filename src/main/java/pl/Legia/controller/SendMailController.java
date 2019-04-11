package pl.Legia.controller;

import org.apache.commons.mail.EmailException;
import pl.Legia.model.User;
import pl.Legia.services.SendEmail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class SendMailController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("SendMailController - doPost");
        request.setCharacterEncoding("utf-8");

        SendEmail sendEmail = new SendEmail();
        String mailTopic;
        String mailContents;
        List<User> mailRecivers;
        HttpSession session = request.getSession(true);

        mailTopic = request.getParameter("MailTopic");
        mailContents = request.getParameter("mailMessage");
        mailRecivers = (List<User>) session.getAttribute("allUsers");
        System.out.println("Lista adresowa z sesji");
        System.out.println(mailRecivers);

        try {
            sendEmail.sendEmail(mailTopic, mailContents, mailRecivers);
        } catch (EmailException e) {
            e.printStackTrace();
        }

        response.setStatus(307);
        response.sendRedirect(request.getContextPath() + "/mainPage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
