package pl.Legia.factory;

public class MysqlDAOFactory extends DAOFactory {


    @Override
    public UserDAO getUserDAO() {
        return new UserDAOImpl();
    }

    @Override
    public ProposalDAO getProposalDAO() {
        return new ProposalDAOImpl();
    }

    @Override
    public ProposalListDAO getProposalListDAO() {
        return new ProposalListDAOImpl();
    }


}
