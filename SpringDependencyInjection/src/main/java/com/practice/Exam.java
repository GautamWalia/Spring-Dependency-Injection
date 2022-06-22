package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		
		
		  ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		  
		  Student got= context.getBean("student", Student.class);
		  got.displayStudentInfo();
		  
		  Student arun= context.getBean("arun", Student.class);
		  arun.displayStudentInfo();
		 
		
		
	}
}
