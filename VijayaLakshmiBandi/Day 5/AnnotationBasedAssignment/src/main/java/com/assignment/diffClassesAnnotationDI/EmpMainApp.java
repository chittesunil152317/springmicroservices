package com.assignment.diffClassesAnnotationDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new AnnotationConfigApplicationContext(EmployeeDetailsConfig.class);
		EmployeeDetails empDetails = (EmployeeDetails)appCon.getBean(EmployeeDetails.class);
		empDetails.setEmpID(500);
		empDetails.setEmpName("Vijaya");
		SalaryDetails salDetails = (SalaryDetails)appCon.getBean(SalaryDetails.class);
		salDetails.setAnnualSalary(2000000);
		salDetails.getAnnualSalary();
		empDetails.setSalary(salDetails);
//		empDetails.setSalary();
		empDetails.display();

	}

}
