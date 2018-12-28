package pl.Legia.controller;

import pl.Legia.model.Proposal;
import pl.Legia.model.User;
import pl.Legia.serviceLayer.ProposalListService;
import pl.Legia.serviceLayer.ProposalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProposalListController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("ProposalListController - Post");

        request.setCharacterEncoding("UTF-8");

        Proposal proposal = null;
        User loggedUser = (User) request.getSession().getAttribute("user");
        if(loggedUser != null){
            long userId = loggedUser.getUser_id();
            long proposalId = proposal.getProposalId();
            System.out.println("Wartości usera i proposal" + userId + ", " + proposalId);

            ProposalListService proposalListService = new ProposalListService();
            proposalListService.addProposalList(userId, proposalId);
            response.sendRedirect(request.getContextPath()+ "/mainPage");


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("ProposalListController - Get");

        request.setCharacterEncoding("UTF-8");

        Proposal proposal = new Proposal();
        ProposalService proposalService = null;
        User loggedUser = (User) request.getSession().getAttribute("user");
        System.out.println("Logged user ID: " + loggedUser.getUser_id());
        if(loggedUser != null){
            long userId = loggedUser.getUser_id();
            System.out.println("User ID "+ userId);
            proposal = (Proposal) proposalService.getProposalByUserId(userId);
            long proposalId = proposal.getProposalId();

            System.out.println("Wartości usera i proposal" + userId + ", " + proposalId);

            ProposalListService proposalListService = new ProposalListService();
            proposalListService.addProposalList(userId, proposalId);
            response.sendRedirect(request.getContextPath()+ "/mainPage");


        }

    }

}
