package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculations.Maths;

public class calculationsTests {

	@Test
	public void testaddition() {
		
		
		assertEquals(10, Maths.addition(8,2));
		assertEquals(12, Maths.addition(6, 6));
	}

	
	@Test
	public void testaddition1() {
		
		assertEquals(6, Maths.subtract(8,2));
		assertEquals(0, Maths.subtract(6,6));
	}
	@Test
	public void testaddition3() {
		
		assertEquals(16, Maths.multiplication(8,2));
		assertEquals(36, Maths.multiplication(6,6));
	}
	@Test
	public void testaddition4() {
		assertEquals(4, Maths.division(8,2));
		assertEquals(1, Maths.division(6,6));
	}
}
