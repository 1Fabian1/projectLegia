package pl.Legia.factory;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import pl.Legia.dataSource.ConnectionProvider;
import pl.Legia.model.Training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TrainingDAOImpl implements TrainingDAO {

    private final static String READ_TRAINING_BY_ID = "select distinct training.training_id, training.military_book_number, training.substantiation, training.qualifications, training.theoretical_part, training.basic_module, " +
            "training.pre_officer_module, training.training_place, training.user_id, training.university_address " +
            "from user, training, proposal " +
            "where " +
            "training.user_id = :user_id and " +
            "proposal.user_id = :user_id;";

    private NamedParameterJdbcTemplate template;

    public TrainingDAOImpl() {
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
    }

    @Override
    public Training create(Training newObject) {
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
        ressultTraining = template.queryForObject(READ_TRAINING_BY_ID, parameterSource, new TrainingRowMapper());
        return ressultTraining;
    }

    private class TrainingRowMapper implements RowMapper<Training> {
        @Override
        public Training mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            Training training = new Training();
            training.setTraining_id(resultSet.getLong("training_id"));
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
