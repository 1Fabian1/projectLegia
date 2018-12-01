package pl.Legia.dataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionToBase {
    private static DataSource dataSource;

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static DataSource getDataSource() {
        if (dataSource == null) {
            try {
                Context initContext = new InitialContext();
                Context context = (Context) initContext.lookup("java:comp/env");
                DataSource dataSrc = (DataSource) context.lookup("jdbc/mydb");
                dataSource = dataSrc;

            } catch (NamingException e) {
                e.printStackTrace();
            }
        }
        return dataSource;
    }
}
