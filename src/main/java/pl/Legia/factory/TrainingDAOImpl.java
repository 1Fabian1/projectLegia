package pl.Legia.factory;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.Legia.dataSource.ConnectionProvider;
import pl.Legia.model.Training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainingDAOImpl implements TrainingDAO {

    private final static String READ_TRAINING_BY_ID = "select distinct training.military_book_number, training.substantiation, training.qualifications, training.theoretical_part, training.basic_module, " +
            "training.pre_officer_module, training.training_place, training.user_id, training.university_address " +
            "from user, training, proposal " +
            "where " +
            "training.user_id = :user_id and " +
            "proposal.user_id = :user_id;";

    private final static String ADD_TRAINING = "INSERT INTO training(military_book_number, substantiation, qualifications, theoretical_part, basic_module, pre_officer_module, training_place," +
            "university_address, user_id)" +
            "VALUES (:military_book_number, :substantiation, :qualifications, :theoretical_part, :basic_module, :pre_officer_module, :training_place," +
                ":university_address, :user_id)";

    private NamedParameterJdbcTemplate template;

    public TrainingDAOImpl() {
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
    }

    @Override
    public Training create(Training training) {
        return null;
    }

    @Override
    public Training read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(Training updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<Training> getAll() {
        return null;
    }

    @Override
    public Training getTrainingByUserId(long userId) {
        Training ressultTraining = new Training();
        SqlParameterSource parameterSource = new MapSqlParameterSource("user_id", userId);
        try {
            ressultTraining = template.queryForObject(READ_TRAINING_BY_ID, parameterSource, new TrainingRowMapper());
        }catch (org.springframework.dao.EmptyResultDataAccessException e)
        {
            e.printStackTrace();
        }

        return ressultTraining;
    }

    @Override
    public Training createTraining(Training training) {
        Training resultTraining = new Training();
        KeyHolder holder = new GeneratedKeyHolder();
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("military_book_number", training.getMilitaryBookNumber());
        paramMap.put("substantiation", training.getSubstantiation());
        paramMap.put("qualifications", training.getQualifications());
        paramMap.put("theoretical_part", training.getTheoreticalPart());
        paramMap.put("basic_module", training.getBasicModule());
        paramMap.put("pre_officer_module", training.getPreOfficerModule());
        paramMap.put("training_place", training.getTrainingPlace());
        paramMap.put("university_address", training.getUniversityAddress());
        paramMap.put("user_id", training.getUserId());

        try {
            SqlParameterSource parameterSource = new MapSqlParameterSource(paramMap);
            int update = template.update(ADD_TRAINING, parameterSource, holder);
            if(update > 0){
                resultTraining.setTraining_id(holder.getKey().longValue());
            }
        } catch (org.springframework.dao.DuplicateKeyException e) {
            e.printStackTrace();
        } catch (NullPointerException e)
        {
            e.printStackTrace();
        }

        return  resultTraining;
    }

    private class TrainingRowMapper implements RowMapper<Training> {
        @Override
        public Training mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            Training training = new Training();
            training.setMilitaryBookNumber(resultSet.getString("military_book_number"));
            training.setSubstantiation(resultSet.getString("substantiation"));
            training.setQualifications(resultSet.getString("qualifications"));
            training.setTheoreticalPart(resultSet.getString("theoretical_part"));
            training.setBasicModule(resultSet.getString("basic_module"));
            training.setPreOfficerModule(resultSet.getString("pre_officer_module"));
            training.setTrainingPlace(resultSet.getString("training_place"));
            training.setUniversityAddress(resultSet.getString("university_address"));
            training.setUserId(resultSet.getLong("user_id"));

            return training;
        }
    }
}
