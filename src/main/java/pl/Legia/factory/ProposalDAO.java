package pl.Legia.factory;

import pl.Legia.model.Proposal;

import java.util.List;

public interface ProposalDAO extends GenericDAO<Proposal, Long> {

    List<Proposal> getAll();
    Proposal getProposalById(long proposalId);
    List<Proposal> getProposalByUserId(long userId);
    Proposal updateProposal(Proposal proposal);
}
