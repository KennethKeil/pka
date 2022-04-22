package pka.excercise.solution;
import java.sql.*;

public class JDBCConnection {

    public static void main(String[] args) throws SQLException {

    	// no driver registration, driver is found in "lib"
        String databaseURL = "jdbc:ucanaccess://U:/tmp/Turnierverwaltung.accdb";
        
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        
        try {

        	String sql = "SELECT s.Vereinsname, a.Strasse, a.Hausnummer, a.PLZ, a.Ort FROM Schachverein s JOIN Adresse a ON s.adresse = a.ID ORDER BY Vereinsname ASC";
        	
        	// 1. get a Connection
        	connection = DriverManager.getConnection(databaseURL);
        	
        	// 2. create a SQL-Statement
            statement = connection.createStatement();
            
            // 3. execute Query
            result = statement.executeQuery(sql);

            // 4. process the result
            while (result.next()) {
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
        } catch (SQLException ex) {
        	ex.printStackTrace();
        } finally {
        	if (result != null) result.close();
        	if (statement != null) statement.close();
        	if (connection != null) connection.close();
        }
    }
}
