package com.nse.reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicHumanReflection {

	public static void main(String[] args) throws Exception {
		// Loading class manually in memory
		Class hc = Class.forName("com.nse.reflect.Human");	// Qualified class name
		
		// Getting default constructor from class
		Constructor defConst = hc.getConstructor(null);

		// Instantiating class using default constructor
		Object obj = defConst.newInstance(null);
		
		System.out.println(obj);
		
		Object pobj = hc.getConstructor(String.class).newInstance("Jim");
		System.out.println(pobj);
		
		Method print = hc.getDeclaredMethod("print", null);
		print.setAccessible(true);
		print.invoke(pobj, null);
		
	}
}
