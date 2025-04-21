package com.springcore.CustomerAccountManagementSystem.model;

public class Customer {
    private int customerId;
    private String name;
    private String accountType;
    private double balance;

    // Parameterized constructor to initialize customer object
    public Customer(int customerId, String name, String accountType, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method to display customer details
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Account Type: " + accountType + ", Balance: $" + balance;
    }
}
