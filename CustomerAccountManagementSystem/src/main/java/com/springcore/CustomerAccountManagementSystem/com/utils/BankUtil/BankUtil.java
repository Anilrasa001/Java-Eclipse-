package com.springcore.CustomerAccountManagementSystem.com.utils.BankUtil;

import com.springcore.CustomerAccountManagementSystem.model.*;
import com.springcore.CustomerAccountManagementSystem.store.*;	

import java.util.*;

public class BankUtil {

    public static void main(String[] args) {
        // Create some sample customer objects
        Customer customer1 = new Customer(1, "Anilrasa", "Savings", 5000.00);
        Customer customer2 = new Customer(2, "Jyothipriya", "Current", 3000.00);
        Customer customer3 = new Customer(3, "jyothika", "Savings", 1500.00);
        Customer customer4 = new Customer(4, "Rahul", "Current", 2000.00);

        // Add customers to a list
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        // Create BankStore object to manage customer data
        BankStore bankStore = new BankStore();

        // Add customers to the database
        bankStore.addCustomers(customers);

        // Accept customer name from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name to search: ");
        String name = scanner.nextLine();

        // Search for customers by name and print matching records
        List<Customer> searchResults = bankStore.searchByName(name);
        if (searchResults.isEmpty()) {
            System.out.println("No customers found with the name " + name);
        } else {
            System.out.println("Found the following customers:");
            for (Customer customer : searchResults) {
                System.out.println(customer);
            }
        }
    }
}
