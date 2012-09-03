package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorialWithPositive() {
//		fail("Not yet implemented");
		int number = 5;
		Factorial factorial = new Factorial(number);
		int result = factorial.getFactorial();
		assertEquals(120, result);
	}
	
	
	@Test
	public void testFactorialWithZero(){
		Factorial factorial = new Factorial(2);
		assertEquals(1, factorial.getFactorial());
	}
	
}
