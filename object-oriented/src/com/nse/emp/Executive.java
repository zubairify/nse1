package com.nse.emp;

public class Executive extends Employee {
	private double commission;

	public Executive() {
		super();	// Optional - By default it calls default constructor of parent class
	}

	public Executive(String empName, double salary, double commission) {
		super(empName, salary);	// Explicitly calling super class constructor
		this.commission = commission;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commission: " + commission);
	}
	
}
