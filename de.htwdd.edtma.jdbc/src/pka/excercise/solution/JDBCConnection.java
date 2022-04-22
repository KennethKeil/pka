package pka.excercise.solution;
import java.sql.*;

public class JDBCConnection {

    public static void main(String[] args) throws ClassNotFoundException {

        String databaseURL = "jdbc:ucanaccess://Users/kenneth-raphaelkeil/Desktop/Studium/Semester 6/PKA/Turnierverwaltung.accdb";

        try (Connection connection = DriverManager.getConnection(databaseURL)) {

            String sql = "SELECT * FROM Verein";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getString(1));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
