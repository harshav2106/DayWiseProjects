package com.wipro.jdbcdemo.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class readEmployees {
	public readEmployees(Connection conn) {
	    String selectSQL = "SELECT id, emp_name, department FROM employee";
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    try {
	        pstmt = conn.prepareStatement(selectSQL);
	        rs = pstmt.executeQuery();

	        System.out.println("\nEmployee Records:");
	        System.out.println("----------------------------");

	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("emp_name");
	            String dept = rs.getString("department");

	            System.out.println("ID: " + id + ", Name: " + name + ", Department: " + dept);
	        }

	    } catch (SQLException e) {
	        System.out.println("Error while reading employees:");
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
}