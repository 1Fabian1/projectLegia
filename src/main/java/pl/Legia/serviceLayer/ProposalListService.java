package pl.Legia.serviceLayer;

import pl.Legia.factory.DAOFactory;
import pl.Legia.factory.ProposalListDAO;
import pl.Legia.model.ProposalList;

public class ProposalListService {

    public void addProposalList(long userUserId, long proposalProposalId){
        ProposalList proposalList = new ProposalList();
        proposalList.setUserUserId(userUserId);
        proposalList.setProposalProposalId(proposalProposalId);
        DAOFactory factory = DAOFactory.getDAOFactory();
        ProposalListDAO proposalListDAO = factory.getProposalListDAO();
        proposalListDAO.create(proposalList);


    }
}
