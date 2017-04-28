package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDao{

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // D사 DB connection 생성 코드
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/toby", "postgres", "");

        return c;
    }
}
