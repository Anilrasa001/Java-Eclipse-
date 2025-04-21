package com.example.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.SpringDemo1.Appconfig.Appconfig;
import com.example.SpringDemo1.Model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ){
        //System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        
        Student e1 = ctx.getBean("s1",Student.class);
        System.out.println(e1);
	}
}
