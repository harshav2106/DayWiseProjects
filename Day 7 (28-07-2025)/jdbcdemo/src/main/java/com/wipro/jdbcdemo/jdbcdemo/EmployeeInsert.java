package com.wipro.jdbcdemo.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wiprojdbc"; 
        String user = "root";
        String password = "admin";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database!");
            String createTable = "CREATE TABLE IF NOT EXISTS employee (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "emp_name VARCHAR(45)," +
                    "department VARCHAR(45))";
            conn.createStatement().executeUpdate(createTable);
            System.out.println("Table 'employee' is ready.");

            String insertSQL = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);

            pstmt.setString(1, "Harsha");
            pstmt.setString(2, "Trainer");

            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Inserted " + rowsInserted + " record(s) into 'employee' table.");

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error occurred:");
            e.printStackTrace();
        }
    }
}
        




