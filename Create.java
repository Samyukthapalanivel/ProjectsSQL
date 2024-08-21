
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Create{
    public static void main(String[] sgd){
        String URL="jdbc:mysql://localhost:3306/Tour";
        String USER="root";
        String PASSWORD="Root123";
        try{
            Connection con=DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Success");
            Statement selectStatement=con.createStatement();
            String createTableSQL="CREATE TABLE Tourist("+"id INT AUTO_INCREMENT PRIMARY KEY,"
            +"TouristF_Name VARCHAR(20) NOT NULL,"
            +"TouristL_Name VARCHAR(18) NOT NULL,"
            +"TEmail VARCHAR(35) NOT NULL,"
            +"TVisiting_date DATE NOT NULL"+")";
            selectStatement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");
           }
           catch(SQLException e){
            System.out.println(e);
           
           }

        
        }

    }

