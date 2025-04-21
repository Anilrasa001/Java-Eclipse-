package com.springcore.BasicCalculatorApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.controller.CalculatorController;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ){
        //System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CalculatorController.class);
        ArithmaticService ap = ctx.getBean("a1",ArithmaticService.class);
        System.out.println(ap);
	}
    
}
