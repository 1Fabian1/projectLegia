package pl.Legia.controller;

import pl.Legia.model.ProposalList;
import pl.Legia.model.User;
import pl.Legia.serviceLayer.ProposalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

public class ProposalController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("ProposalController - Post");
        request.setCharacterEncoding("UTF-8");

        String first_name = request.getParameter("first_name");
        String second_name = request.getParameter("second_name");
        String surname = request.getParameter("surname");
        String citizenship = request.getParameter("citizenship");
        Date birth_date = Date.valueOf(request.getParameter("birth_date"));
        String birth_place = request.getParameter("birth_place");
        String PESEL = request.getParameter("PESEL");
        String address_of_stay = request.getParameter("address_of_stay");
        String address_for_correspondence = request.getParameter("address_for_correspondence");
        String phone_number = request.getParameter("phone_number");
        String university_name = request.getParameter("university_name");
        String university_faculty = request.getParameter("university_faculty");
        String field_of_study = request.getParameter("field_of_study");
        String year_of_study = request.getParameter("year_of_study");
        String planned_year_of_graduation = request.getParameter("planned_year_of_graduation");
        String health_category = request.getParameter("health_category");
        System.out.println(first_name + " " + surname + " " + PESEL + " " + health_category);
        ProposalService proposalService = new ProposalService();
        proposalService.addProposal(first_name, second_name, surname, citizenship, birth_date, birth_place, PESEL,
                address_of_stay, address_for_correspondence, phone_number, university_name, university_faculty, field_of_study,
                year_of_study, planned_year_of_graduation, health_category);
        response.setStatus(307);
        response.sendRedirect(request.getContextPath() + "/proposalList");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ProposalController - Get");
        request.getRequestDispatcher("proposal.jsp").forward(request, response);

        System.out.println("principal:" + request.getUserPrincipal().toString());
    }
}
