package com.utils;

import com.controller.CalculatorController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Initialize the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve CalculatorController bean
        CalculatorController calculatorController = context.getBean(CalculatorController.class);

        // Perform operations
        int additionResult = calculatorController.performAddition(10, 5);
        int subtractionResult = calculatorController.performSubtraction(10, 5);

        // Display results
        System.out.println("Addition Result: " + additionResult);
        System.out.println("Subtraction Result: " + subtractionResult);
    }
}
