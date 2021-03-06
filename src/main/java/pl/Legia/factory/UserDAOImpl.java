package pl.Legia.factory;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.Legia.dataSource.ConnectionProvider;
import pl.Legia.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private static final String CREATE_USER =
            "INSERT INTO user(username, password, email) VALUES(:username, :password, :email);";
    private static final String READ_USER =
            "SELECT user_id, username, password, email FROM user WHERE user_id=:id;";
    private static final String READ_USER_BY_USERNAME =
            "SELECT user_id, username, password, email FROM user WHERE username=:username;";

    private static final String READ_IF_ADMIN = "select user.user_id, user.username, user.password, user.email from user_role, user Where user.username = user_role.username and user_role.role_name = \"admin\" and user.username = :username";

    private static final String READ_ALL_USERS_BUT_LOGGED = "select * from legianew.user where user.username != :username;";

    private static final String READ_WHOLE_BASE = "select * from user, proposal, training where user.user_id = proposal.user_id AND user.user_id = training.user_id;";

    private NamedParameterJdbcTemplate template;

    public UserDAOImpl() {
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
    }

    @Override
    public User create(User user) {
        User resultUser = new User(user);
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(user);
        int update = template.update(CREATE_USER, parameterSource, holder);
        if (update > 0) {
            resultUser.setUser_id(holder.getKey().longValue());
            setPrivigiles(resultUser);
        }
        return resultUser;
    }

    private void setPrivigiles(User user) {
        final String userRoleQuery = "INSERT INTO user_role(username) VALUES(:username)";
        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
        template.update(userRoleQuery, paramSource);
    }


    @Override
    public User read(Long primaryKey) {
        User resultUser = null;
        SqlParameterSource parameterSource = new MapSqlParameterSource("id", primaryKey);
        resultUser = (User) template.queryForObject(READ_USER, parameterSource, new UserRowMapper());
        return resultUser;
    }

    public User checkIfAdmin(String username) {
        User resultUser = null;
        SqlParameterSource parameterSource = new MapSqlParameterSource("username", username);
        try{
            resultUser = (User) template.queryForObject(READ_IF_ADMIN, parameterSource, new UserRowMapper());
        }
        catch (EmptyResultDataAccessException e){
            System.out.println("Not an admin");
        }
        return resultUser;
    }

    @Override
    public List<User> readAllUsersButLogged(String username) {
        List<User> allResultUsers = null;
        SqlParameterSource parameterSource = new MapSqlParameterSource("username", username);
        allResultUsers = (List<User>) template.query(READ_ALL_USERS_BUT_LOGGED, parameterSource, new UserRowMapper());
        return allResultUsers;
    }

    @Override
    public boolean update(User updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        User resultUser = null;
        SqlParameterSource paramSource = new MapSqlParameterSource("username", username);
        resultUser = (User) template.queryForObject(READ_USER_BY_USERNAME, paramSource, new UserRowMapper());
        return resultUser;
    }


    private class UserRowMapper implements RowMapper {

        @Override
        public User mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
            User user = new User();
            user.setUser_id(resultSet.getLong("user_id"));
            user.setUsername(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));
            return user;
        }
    }

}
