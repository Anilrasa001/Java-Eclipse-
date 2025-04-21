package com.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {
    // No need to define beans explicitly, as components are auto-detected using @ComponentScan
}
