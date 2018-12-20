package pl.Legia.factory;

import pl.Legia.model.ProposalList;

import java.util.List;

public interface ProposalListDAO extends GenericDAO<ProposalList, Long> {
    List<ProposalList> getAll();

}
