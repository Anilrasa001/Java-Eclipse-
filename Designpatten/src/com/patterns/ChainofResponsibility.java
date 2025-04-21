package com.patterns;


abstract class PaymentHandler {
 protected PaymentHandler nextHandler;

 public void setNextHandler(PaymentHandler nextHandler) {
     this.nextHandler = nextHandler;
 }

 public abstract void handlePayment(int amount);
}

//Concrete Handler 1
class BankPayment extends PaymentHandler {
 @Override
 public void handlePayment(int amount) {
     if (amount <= 500) {
         System.out.println("Bank handled payment of ₹" + amount);
     } else if (nextHandler != null) {
         nextHandler.handlePayment(amount);
     } else {
         System.out.println("Payment of ₹" + amount + " cannot be handled.");
     }
 }
}

//Concrete Handler 2
class CreditCardPayment extends PaymentHandler {
 @Override
 public void handlePayment(int amount) {
     if (amount <= 1000) {
         System.out.println("Credit Card handled payment of ₹" + amount);
     } else if (nextHandler != null) {
         nextHandler.handlePayment(amount);
     } else {
         System.out.println("Payment of ₹" + amount + " cannot be handled.");
     }
 }
}

//Concrete Handler 3
class PayPalPayment extends PaymentHandler {
 @Override
 public void handlePayment(int amount) {
     if (amount <= 1500) {
         System.out.println("PayPal handled payment of ₹" + amount);
     } else if (nextHandler != null) {
         nextHandler.handlePayment(amount);
     } else {
         System.out.println("Payment of ₹" + amount + " cannot be handled.");
     }
 }
}

//Client
 class ChainofResponsibility {
 public static void main(String[] args) {
     // Create handlers
     PaymentHandler bank = new BankPayment();
     PaymentHandler creditCard = new CreditCardPayment();
     PaymentHandler paypal = new PayPalPayment();

     // Set the chain: Bank -> CreditCard -> PayPal
     bank.setNextHandler(creditCard);
     creditCard.setNextHandler(paypal);

     // Test payments
     bank.handlePayment(300);   // Bank handles
     bank.handlePayment(700);   // Credit Card handles
     bank.handlePayment(1300); 
     bank.handlePayment(1400); // PayPal handles
     bank.handlePayment(2000);  // No handler available
 }
}