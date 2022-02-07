package com.nse.reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HumanReflection {

	public static void main(String[] args) throws ClassNotFoundException {
//		Human h = new Human("Kelly");
//		System.out.println(h);
//		
//		Class hc = h.getClass();
		
		// forName() helps loading class manually  
		Class hc = Class.forName("com.nse.reflect.Human");
		
		System.out.println(hc.getName());
		
		System.out.println("-- List of constructors");
		Constructor[] constructors = hc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println("-- List of methods");
		Method[] methods = hc.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("-- List of declared methods");
		Method[] decMethods = hc.getDeclaredMethods();
		for (Method m : decMethods) {
			System.out.println(m);
		}
		
		System.out.println("-- List of fields");
		Field[] fields = hc.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
		}
	}
}
