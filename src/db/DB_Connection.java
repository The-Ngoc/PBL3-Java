package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    public static  Connection getConnection(){
        Connection c = null;

        String url = "jdbc:mysql://localhost:3306/PBL3";
        String userName = "root";
        String passWord = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(url,userName,passWord);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }

    public static void closeConnection(Connection c){
        try {
            if(c != null ){
                c.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
