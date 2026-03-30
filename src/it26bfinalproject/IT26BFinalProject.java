package it26bfinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IT26BFinalProject {

    private static final String URL = "jdbc:mysql://localhost:3306/student_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
                Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully");
            
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        
        return conn;
    }

}
