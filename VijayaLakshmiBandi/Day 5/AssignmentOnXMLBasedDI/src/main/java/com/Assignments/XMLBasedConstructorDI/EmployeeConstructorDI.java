package com.Assignments.XMLBasedConstructorDI;

public class EmployeeConstructorDI {
	private int empid;
	private String employeeName ;
	private double empsalary;
	public EmployeeConstructorDI() {
		System.out.println("Default Constructor");
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public EmployeeConstructorDI(int empid,String employeeName, double empsalary) {
		this.employeeName = employeeName;
		this.empid = empid;
		this.empsalary = empsalary;
		
	}
	void display() {
		System.out.println("Emp name "+employeeName+" \nEmp ID "+empid+"\nEmpSalary "+empsalary);
	}
}
