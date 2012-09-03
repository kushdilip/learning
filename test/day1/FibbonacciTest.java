package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibbonacciTest {

	@Test
	public void testFibbo() {
//		fail("Not yet implemented");
//		fibbo series 1,1,2,3,5,8,13,21,34
		int number = 3;
		Fibbonacci fib = new Fibbonacci(number);
		int result = fib.getFibbonacci();
		assertEquals(3, result);
	}

}
