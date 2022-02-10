package com.nse.bank;

import java.util.ArrayList;

/**
 * This class represents general bank account. It is further specialised as savings and current accounts.
 * @author Zubair Shaikh
 * @version 1.0
 */
public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int autogen = INIT_ACNT_NO;
	
	protected ArrayList<Transaction> txns;
	
	/** Default constructor of accounts*/
	public Accounts() {
	}

	/**
	 * Parameterised constructor of accounts. It takes holder name and balance to open account.
	 * @param holder
	 * @param balance
	 */
	public Accounts(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
		
		txns = new ArrayList<Transaction>();
		txns.add(new Transaction("Cr", balance, balance));
	}
	
	/** Method to deposit money to bank account. */
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("Cr", amount, balance));
	}
	
	public abstract void withdraw(double amount) throws BalanceException;
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}
	
	public void statement() {
		System.out.println("Statement for the A/C: " + acntNo);
		System.out.println("Type\tAmount\tBalance");
		for(Transaction t : txns)
			t.print();
	}
}
