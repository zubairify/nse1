package com.nse.bank;

public class Transaction {
	private String type;
	private double amount;
	private double balance;
	
	public Transaction() {
	}

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public void print() {
		System.out.println(type + "\t" + amount + "\t" + balance);
	}
}
