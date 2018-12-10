package pl.Legia.factory;

import pl.Legia.model.Proposal;

import java.util.List;

public interface ProposalDAO extends GenericDAO<Proposal, Long> {

    List<Proposal> getAll();
}
