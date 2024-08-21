import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update1 {
    private static final String URL = "jdbc:mysql://localhost:3306/Tour";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Root123"; 

    public static void main(String[] upd) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            String updateSQL = "UPDATE Tourist SET TEmail = ? WHERE TouristF_Name = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateSQL);
            updateStatement.setString(1, "bhu@gmail.com");
            updateStatement.setString(2, "Samyukth");  
            int rowsUpdated = updateStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Update operation completed. Rows updated: " + rowsUpdated);
            } else {
                System.out.println("No rows updated. Check the provided names.");
            }

        } catch (SQLException e) {
            System.out.println("Error during update: " + e.getMessage());
        }
    }
}