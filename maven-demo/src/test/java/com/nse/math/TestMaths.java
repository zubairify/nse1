package com.nse.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMaths {

	private static Maths maths;
	
	@BeforeAll
	public static void init() {
		maths = new Maths();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, maths.add(5, 5));
	}
	
	@Test
	public void testSubs() {
		assertEquals(5, maths.subs(10, 5));
	}
	
	@Test
	public void testDiv() {
		
	}
	
	@Test
	public void testZeroDiv() {
		
	}
	
	@Test
	public void testSquare() {
		
	}
}
