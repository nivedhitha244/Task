import java.sql.*;
public class JDBCConnectionExample {
    public static void main(String[] args) {
       try{
        final String URL="";
        final String USERNAME="";
        final String PASSWORD="";
        Connection connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        System.out.println("Connection established successfully!");
       } catch (SQLException e) {
            e.printStackTrace();
       }
    }
}