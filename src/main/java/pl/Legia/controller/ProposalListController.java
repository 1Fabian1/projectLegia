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


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProposalService proposalService = new ProposalService();
        User loggedUser = (User) request.getSession().getAttribute("user");
        if(loggedUser != null){
            long userUserId = loggedUser.getUser_id();
            long proposalProposalId = 0; /////////wrong

            ProposalListService proposalListService = new ProposalListService();
            proposalListService.addProposalList(userUserId, proposalProposalId);

        }

    }
}
