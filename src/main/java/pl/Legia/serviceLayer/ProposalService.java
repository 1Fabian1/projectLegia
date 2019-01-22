package pl.Legia.serviceLayer;

import pl.Legia.factory.DAOFactory;
import pl.Legia.factory.ProposalDAO;
import pl.Legia.model.Proposal;

import java.sql.Date;
import java.util.Comparator;
import java.util.List;

public class ProposalService {

    public void addProposal(String first_name, String second_name, String surname, String citizenship, Date birth_date,
                            String birth_place, String PESEL, String address_of_stay, String address_for_correspondence,
                            String phone_number, String university_name, String university_faculty,
                            String field_of_study, String year_of_study, String planned_year_of_graduation, String health_category, long user_id) {
        Proposal proposal = new Proposal();

        proposal.setFirstName(first_name);
        proposal.setSecondName(second_name);
        proposal.setSurname(surname);
        proposal.setCitizenship(citizenship);
        proposal.setBirthDate(birth_date);
        proposal.setBirthPlace(birth_place);
        proposal.setPESEL(PESEL);
        proposal.setAddressOfStay(address_of_stay);
        proposal.setAddressOfCorrespondence(address_for_correspondence);
        proposal.setPhoneNumber(phone_number);
        proposal.setUniversityName(university_name);
        proposal.setUniversityFaculty(university_faculty);
        proposal.setFieldOfStudy(field_of_study);
        proposal.setYearOfStudy(year_of_study);
        proposal.setPlannedYearOfGraduation(planned_year_of_graduation);
        proposal.setHealthCategory(health_category);
        proposal.setUserId(user_id);
        DAOFactory factory = DAOFactory.getDAOFactory();
        ProposalDAO proposalDAO = factory.getProposalDAO();
        proposalDAO.create(proposal);
    }

    public Proposal getProposalById(long proposalId){
        DAOFactory daoFactory = DAOFactory.getDAOFactory();
        ProposalDAO proposalDAO = daoFactory.getProposalDAO();
        Proposal proposal = proposalDAO.getProposalById(proposalId);
        return proposal;
    }



    public List<Proposal> getProposalByUserId(long userId){
        DAOFactory daoFactory = DAOFactory.getDAOFactory();
        ProposalDAO proposalDAO = daoFactory.getProposalDAO();
        List<Proposal> proposals = (List<Proposal>) proposalDAO.getProposalByUserId(userId);
        return proposals;
    }


    public List<Proposal> getAllProposals(){
        return getAllProposals(null);
    }

    public List<Proposal>getAllProposals(Comparator<Proposal>comparator){
        DAOFactory factory = DAOFactory.getDAOFactory();
        ProposalDAO proposalDAO = factory.getProposalDAO();
        List<Proposal> proposals = proposalDAO.getAll();
        if(comparator != null && proposals != null){
            proposals.sort(comparator);
        }
        return proposals;
    }


}
