package pka.excercise.solution;
import java.sql.*;
import pka.excercise.*;

public class CRUD {

    private static final String INSERT_CLUB_SQL = "INSERT INTO Schachverein" +
            "  (ZPS-Code, Vereinsname) VALUES " +
            " (?, ?);";

    private static final String QUERY = "SELECT s.Vereinsname, a.Strasse, a.Hausnummer, a.PLZ, a.Ort FROM Schachverein s JOIN Adresse a ON s.adresse = a.ID ORDER BY Vereinsname ASC";

    public static void insertChessClub(ChessClub chessClub) throws SQLException {
        System.out.println(INSERT_CLUB_SQL);

        try (Connection connection = JDBCConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CLUB_SQL)) {

            preparedStatement.setString(1, chessClub.getZpsCode());
            preparedStatement.setString(2, chessClub.getClubName());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            JDBCConnection.printSQLException(e);
        }
        // close connection
    }

    public static void selectChessClub() throws SQLException {

        try (Connection connection = JDBCConnection.getConnection();
             Statement statement = connection.createStatement();) {

            ResultSet result = statement.executeQuery(QUERY);

            while (result.next()) {
                // ToDo initialise ChestClub Object
            	/*
                System.out.println(result.getString("Vereinsname") + ", "
                	+ result.getString("Strasse") + ", "
                	+ result.getString("Hausnummer") + ", "
                	+ result.getString("PLZ") + ", "
                	+ result.getString("Ort")
                );
                */
                // result.getInt()
                // result.getDate()
            }
        } catch (SQLException e) {
            JDBCConnection.printSQLException(e);
        }
        // close connection
    }

    public static void main(String[] args) throws SQLException {

        ChessClub seeblickeV = new ChessClub();
        insertChessClub(seeblickeV);
        // ToDo Print Out ChestClub
    }
}
