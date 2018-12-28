package pl.Legia.factory;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.Legia.dataSource.ConnectionProvider;
import pl.Legia.model.ProposalList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProposalListDAOImpl implements ProposalListDAO {

    private final String CREATE_PROPOSAL_LIST =
            "INSERT INTO proposal_list(user_user_id, proposal_proposal_id)" +
                    "VALUES (:user_user_id, :proposal_proposal_id);";

    private final String READ_PROPOSAL_LIST =
            "SELECT proposal_list_id, user_user_id, proposal_proposal_id " +
                    "FROM proposal_list" +
                    "WHERE proposal_list_id = :proposal_list_id;";

    private NamedParameterJdbcTemplate template;

    public ProposalListDAOImpl() {
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
    }

    @Override
    public ProposalList create(ProposalList proposalList) {
        ProposalList resultProposalList = new ProposalList(proposalList);
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("user_user_id", resultProposalList.getUserUserId());
        paramMap.put("proposal_proposal_id", resultProposalList.getProposalProposalId());
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource parameterSource = new MapSqlParameterSource(paramMap);
        int updade = template.update(CREATE_PROPOSAL_LIST, parameterSource, holder);
        if (updade > 0) {
            resultProposalList.setProposalListId((Long) holder.getKey());
        }
        return resultProposalList;
    }

    @Override
    public ProposalList read(Long primaryKey) {

        SqlParameterSource parameterSource = new MapSqlParameterSource("proposal_list_id", primaryKey);
        ProposalList proposalList = (ProposalList) template.queryForObject(READ_PROPOSAL_LIST, parameterSource, new ProposalListRowMapper());
        return proposalList;
    }

    @Override
    public boolean update(ProposalList updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<ProposalList> getAll() {
        return null;
    }

    private class ProposalListRowMapper implements org.springframework.jdbc.core.RowMapper {
        @Override
        public Object mapRow(ResultSet resultSet, int row) throws SQLException {
            ProposalList proposalList = new ProposalList();
            proposalList.setProposalListId(resultSet.getLong("proposal_list_id"));
            proposalList.setUserUserId(resultSet.getInt("user_user_id"));
            proposalList.setProposalProposalId(resultSet.getInt("proposal_proposal_id"));
            return proposalList;
        }
    }
}
