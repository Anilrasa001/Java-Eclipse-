package com.springcore.CustomerAccountManagementSystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Static method to establish a connection to the database
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Database URL, username, and password for Oracle/PostgreSQL
            String url = "jdbc:postgresql://localhost:5432/bankdb";  
            String username = "postgres"; 
            String password = "7032018987A@anil";  

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            System.out.println("Error in connecting to the database: " + e.getMessage());
        }
        return connection;
    }
}

