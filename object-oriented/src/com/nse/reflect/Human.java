package com.nse.reflect;
import java.security.BasicPermission;

public class Human {
	private String name;
	
	public Human() {
	}

	public Human(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + "]";
	}
	
	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("No trespassing") {});
		System.out.println("Name: " + name);
	}
}
