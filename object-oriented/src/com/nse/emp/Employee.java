package com.nse.emp;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter;

	// static initialiser block, executes at the time of class loading
	static { 		
		counter = 101;
	}
	
	public Employee() {
	}

	public Employee(String empName, double salary) {
		this.empNo = counter ++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void payslip() {
		System.out.println("Emp No: " + empNo);
		System.out.println("Emp Name: " + empName);
		System.out.println("Salary: " + salary);
	}
}
