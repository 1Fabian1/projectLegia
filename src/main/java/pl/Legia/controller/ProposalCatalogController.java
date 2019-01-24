package pl.Legia.controller;

import pl.Legia.model.Proposal;
import pl.Legia.model.User;
import pl.Legia.serviceLayer.ProposalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProposalCatalogController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("ProposalCatalogController - get");

        User loggedUser = (User) request.getSession().getAttribute("user");
        System.out.println(loggedUser.toString());
        long user = (long) loggedUser.getUser_id();
        ProposalService proposalService = new ProposalService();
        List<Proposal> proposals = proposalService.getProposalByUserId(user);

        System.out.println("Proposals dla Catalogu");
        System.out.println(proposals.toString());
        request.getSession().setAttribute("proposals", proposals);

        request.getRequestDispatcher("WEB-INF/view/proposalCatalog.jsp").forward(request, response);
    }
}
