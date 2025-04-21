package com.example.SpringDemo1.Appconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SpringDemo1.Model.Student;
@Configuration
public class Appconfig {
	@Bean
	public Student s1(){
	return new Student(2,"anil");
	}
	

}
