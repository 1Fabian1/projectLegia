package pl.Legia.factory;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.Legia.dataSource.ConnectionProvider;
import pl.Legia.model.Proposal;

import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProposalDAOImpl implements ProposalDAO {

    private static final String CREATE_PROPOSAL =
            "INSERT INTO proposal(first_name, second_name, surname, citizenship, birth_date, birth_place, PESEL,address_of_stay, address_for_correspondence, phone_number, university_name, university_faculty, field_of_study,year_of_study, planned_year_of_graduation, health_category, user_id) " +
                    "VALUES (:first_name, :second_name, :surname, :citizenship, :birth_date, :birth_place, :PESEL,:address_of_stay, :address_for_correspondence, :phone_number, :university_name, :university_faculty, :field_of_study, :year_of_study, :planned_year_of_graduation, :health_category, :user_id);";

    //newer version
    private static final String READ_PROPOSALS_BY_USER_ID = "select distinct proposal_id,first_name,second_name,surname,citizenship,birth_date,birth_place,PESEL,address_of_stay,address_for_correspondence,phone_number,university_name,university_faculty,field_of_study,year_of_study,planned_year_of_graduation,health_category,proposal.user_id " +
            "from  proposal,user " +
            "where proposal.user_id = :user_id;";

    private static final String UPDATE_PROPOSAL = "UPDATE proposal " +
            "SET first_name = :first_name, second_name = :second_name, surname = :surname, citizenship = :citizenship, birth_date = :birth_date, birth_place = :birth_place, " +
            "PESEL = :PESEL, address_of_stay = :address_of_stay, address_for_correspondence = :address_for_correspondence, phone_number = :phone_number, university_name = :university_name, " +
            "university_faculty = :university_faculty, field_of_study = :field_of_study, year_of_study = :year_of_study, planned_year_of_graduation = :planned_year_of_graduation, health_category = :health_category " +
            "where user_id = :user_id";

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
        paramMap.put("user_id", proposal.getUserId());

        SqlParameterSource parameterSource = new MapSqlParameterSource(paramMap);
        int update = template.update(CREATE_PROPOSAL, parameterSource, holder);
        if (update > 0) {
            resultProposal.setProposalId((Long) holder.getKey());
        }

        return resultProposal;
    }


    @Override
    public Proposal read(Long primaryKey) {
        Proposal resultProposal = new Proposal();
        SqlParameterSource parameterSource = new MapSqlParameterSource("id", primaryKey);
        resultProposal = template.queryForObject(READ_PROPOSALS_BY_USER_ID, parameterSource, new ProposalRowMapper());
        return resultProposal;
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
        List<Proposal> proposals = template.query(READ_PROPOSALS_BY_USER_ID, new ProposalRowMapper());
        return proposals;
    }

    @Override
    public Proposal getProposalById(long proposalId) {
        Proposal resultProposal = new Proposal();
        SqlParameterSource parameterSource = new MapSqlParameterSource("id", proposalId);
        resultProposal = template.queryForObject(READ_PROPOSALS_BY_USER_ID, parameterSource, new ProposalRowMapper());
        return resultProposal;
    }

    @Override
    public List<Proposal> getProposalByUserId(long userId) {
        List<Proposal> resultProposalList;
        SqlParameterSource parameterSource = new MapSqlParameterSource("user_id", userId);
        resultProposalList = template.query(READ_PROPOSALS_BY_USER_ID, parameterSource, new ProposalRowMapper());
        return resultProposalList;
    }

    @Override
    public Proposal updateProposal(Proposal proposal) {
        Proposal updateProposal = new Proposal();
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
        paramMap.put("user_id", proposal.getUserId());

        SqlParameterSource parameterSource = new MapSqlParameterSource(paramMap);
        template.update(UPDATE_PROPOSAL, parameterSource);

        return updateProposal;
    }


    private class ProposalRowMapper implements RowMapper<Proposal> {
        @Override
        public Proposal mapRow(ResultSet resultSet, int row) throws SQLException {
            Proposal proposal = new Proposal();
            proposal.setFirstName(resultSet.getString("first_name"));
            proposal.setSecondName(resultSet.getString("second_name"));
            proposal.setSurname(resultSet.getString("surname"));
            proposal.setCitizenship(resultSet.getString("citizenship"));
            proposal.setBirthDate(resultSet.getDate("birth_date"));
            proposal.setBirthPlace(resultSet.getString("birth_place"));
            proposal.setPESEL(resultSet.getString("PESEL"));
            proposal.setAddressOfStay(resultSet.getString("address_of_stay"));
            proposal.setAddressOfCorrespondence(resultSet.getString("address_for_correspondence"));
            proposal.setPhoneNumber(resultSet.getString("phone_number"));
            proposal.setUniversityName(resultSet.getString("university_name"));
            proposal.setUniversityFaculty(resultSet.getString("university_faculty"));
            proposal.setFieldOfStudy(resultSet.getString("field_of_study"));
            proposal.setYearOfStudy(resultSet.getString("year_of_study"));
            proposal.setPlannedYearOfGraduation(resultSet.getString("planned_year_of_graduation"));
            proposal.setHealthCategory(resultSet.getString("health_category"));
            return proposal;
        }
    }


}
