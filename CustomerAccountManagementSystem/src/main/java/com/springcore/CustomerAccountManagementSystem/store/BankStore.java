package com.springcore.CustomerAccountManagementSystem.store;

import com.springcore.CustomerAccountManagementSystem.model.*;
import com.springcore.CustomerAccountManagementSystem.utility.*;

import java.beans.Customizer;
import java.sql.*;
import java.util.*;

public class BankStore {

    private List<Customer> customerList = new ArrayList<>();

    // Method to add customers to the database
    public void addCustomers(List<Customer> customers) {
        String insertSQL = "INSERT INTO customers (customer_id, name, account_type, balance) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            for (Customer customer : customers) {
                pstmt.setInt(1, ((Customer) customer).getCustomerId());
                pstmt.setString(2, ((Customer) customer).getName());
                pstmt.setString(3, ((Customer) customer).getAccountType());
                pstmt.setDouble(4, ((Customer) customer).getBalance());
                pstmt.addBatch();	
            }
            pstmt.executeBatch();
            System.out.println("Customers added to the database successfully.");
        } catch (SQLException e) {
            System.out.println("Error in adding customers to the database: " + e.getMessage());
        }
    }

    // Method to search customers by name
    public List<Customer> searchByName(String name) {
        List<Customer> result = new ArrayList<>();
        String searchSQL = "SELECT * FROM customers WHERE name LIKE ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(searchSQL)) {

            pstmt.setString(1, "%" + name + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String customerName = rs.getString("name");
                String accountType = rs.getString("account_type");
                double balance = rs.getDouble("balance");

                	 Object customer = new Object();
                result.add((Customer) customer);
            }
        } catch (SQLException e) {
            System.out.println("Error in searching customers by name: " + e.getMessage());
        }
        return result;
    }
}
