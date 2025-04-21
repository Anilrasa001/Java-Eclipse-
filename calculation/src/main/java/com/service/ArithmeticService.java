package com.service;

import org.springframework.stereotype.Service;

@Component
class ArithmeticService {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
