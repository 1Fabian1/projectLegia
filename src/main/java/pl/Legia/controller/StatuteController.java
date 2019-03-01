package pl.Legia.controller;

import org.apache.commons.mail.EmailException;
import pl.Legia.services.SendEmail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StatuteController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Get - Statute Controller");

        OutputStream out = response.getOutputStream();
        FileInputStream in = new FileInputStream("C:\\Users\\Fabia\\IdeaProjects\\projectLegia\\web\\resources\\pdf\\statute.pdf");
        byte[] buffer = new byte[4096];
        int length;
        while ((length = in.read(buffer)) > 0){
            out.write(buffer, 0, length);
        }
        in.close();
        out.flush();

    }

}
