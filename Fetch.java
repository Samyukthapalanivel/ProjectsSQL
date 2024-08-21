import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
    public static void main(String[] args){
        String URL="jdbc:mysql://localhost:3306/Tour";
        String USER="root";
        String PASSWORD="Root123";
        try {
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            String selectSQL="SELECT * FROM Tourist";
            Statement selectStatement=con.createStatement();
            ResultSet resultSet=selectStatement.executeQuery(selectSQL);
            System.out.println("Read operation results:");
            while(resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("Id") 
                + ", First Name: " + resultSet.getString("TouristF_Name") 
                + ", Last Name: " + resultSet.getString("TouristL_Name") 
                + ", Email: " + resultSet.getString("TEmail") 
                + ", Tourist Date " + resultSet.getDate("TVisiting_date"));
        }
    } catch (SQLException e) {
        System.out.println(e);

    
            }
    }
}
