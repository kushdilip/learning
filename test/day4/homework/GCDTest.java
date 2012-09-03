package day4.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class GCDTest {

	@Test
	public void testCalcGCD() throws Exception {
//		fail("Not yet implemented");
		GCD numbers = new GCD(30, 75);
		assertEquals(15, numbers.findGCD());
	}
	
	@Test
	public void testFindGCDwithGcd1() throws Exception {
//		fail("Not yet implemented");
		GCD numbers = new GCD(41, 23);
		assertEquals(1,numbers.findGCD());
	}
	
	@Test
	public void testFindGCDwith0() throws Exception {
//		fail("Not yet implemented");
		GCD numbers = new GCD(0, 75);
		assertEquals(75, numbers.findGCD());
	}
	
}
