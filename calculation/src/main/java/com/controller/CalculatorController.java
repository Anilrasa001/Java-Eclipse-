package com.controller;

import com.service.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {

    private final arithmeticService;

    // Constructor-based Dependency Injection
    @Autowired
    public CalculatorController(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    public int performAddition(int a, int b) {
        return arithmeticService.add(a, b);
    }

    public int performSubtraction(int a, int b) {
        return arithmeticService.subtract(a, b);
    }
}
	