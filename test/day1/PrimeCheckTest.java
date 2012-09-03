package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeCheckTest {

	@Test
	public void testCheck() {
//		fail("Not yet implemented");
		int number = 49;
		PrimeCheck primeCheck = new PrimeCheck(number);
		boolean result = primeCheck.isPrime();
		assertEquals(true, result);
	}

}
