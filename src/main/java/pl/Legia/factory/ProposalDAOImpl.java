package pl.Legia.factory;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.Legia.dataSource.ConnectionProvider;
import pl.Legia.model.Proposal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProposalDAOImpl implements ProposalDAO {

    private static final String CREATE_PROPOSAL =
            "INSERT INTO proposal(first_name, second_name, surname, citizenship, birth_date, birth_place, PESEL,address_of_stay, address_for_correspondence, phone_number, university_name, university_faculty, field_of_study,year_of_study, planned_year_of_graduation, health_category) " +
                    "VALUES (:first_name, :second_name, :surname, :citizenship, :birth_date, :birth_place, :PESEL,:address_of_stay, :address_for_correspondence, :phone_number, :university_name, :university_faculty, :field_of_study, :year_of_study, :planned_year_of_graduation, :health_category);";

    private static final String CREATE_PROPOSAL_LIST =
            "INSERT INTO proposal_list(user_user_id, proposal_proposal_id)" +
                    "values" +
                    "(:user.user_id, :proposal.proposal_id);";

    private NamedParameterJdbcTemplate template;

    public ProposalDAOImpl() {
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
    }

    @Override
    public Proposal create(Proposal proposal) {
        Proposal resultProposal = new Proposal();
        KeyHolder holder = new GeneratedKeyHolder();
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("first_name", proposal.getFirstName());
        paramMap.put("second_name", proposal.getSecondName());
        paramMap.put("surname", proposal.getSurname());
        paramMap.put("citizenship", proposal.getCitizenship());
        paramMap.put("birth_date", proposal.getBirthDate());
        paramMap.put("birth_place", proposal.getBirthPlace());
        paramMap.put("PESEL", proposal.getPESEL());
        paramMap.put("address_of_stay", proposal.getAddressOfStay());
        paramMap.put("address_for_correspondence", proposal.getAddressOfCorrespondence());
        paramMap.put("phone_number", proposal.getPhoneNumber());
        paramMap.put("university_name", proposal.getUniversityName());
        paramMap.put("university_faculty", proposal.getUniversityFaculty());
        paramMap.put("field_of_study", proposal.getFieldOfStudy());
        paramMap.put("year_of_study", proposal.getYearOfStudy());
        paramMap.put("planned_year_of_graduation", proposal.getPlannedYearOfGraduation());
        paramMap.put("health_category", proposal.getHealthCategory());
        System.out.println("ProposalDAOImpl health_category:" + proposal.getHealthCategory());


        SqlParameterSource parameterSource = new MapSqlParameterSource(paramMap);
        int update = template.update(CREATE_PROPOSAL, parameterSource, holder);
        if (update > 0) {
            resultProposal.setProposalId((Long) holder.getKey());
        }

        return resultProposal;
    }

    private void setProposalList(Proposal proposal) {

        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(proposal);
        template.update(CREATE_PROPOSAL_LIST, paramSource);
    }


    @Override
    public Proposal read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(Proposal updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<Proposal> getAll() {
        return null;
    }
}
