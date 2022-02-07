package com.nse.bank;

public final class AccountFactory {
	
	private AccountFactory() {
	}

//	public Savings createSavingsAccount(String holder) {
//		return new Savings(holder);
//	}
//	
//	public Current createCurrentAccount(String holder) {
//		return new Current(holder);
//	}
	
	public static Bank createAccount(String holder, String type) {
		if(type.equalsIgnoreCase("savings"))
			return new Savings(holder);
		else
			return new Current(holder);
	}
}
