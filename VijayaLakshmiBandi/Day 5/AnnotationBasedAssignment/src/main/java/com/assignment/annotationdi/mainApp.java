package com.assignment.annotationdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeClass emp = (EmployeeClass)appCon.getBean(EmployeeClass.class);
		emp.setName("Vijaya");
		emp.display();
	}

}
