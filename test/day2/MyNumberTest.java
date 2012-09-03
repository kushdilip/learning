package day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyNumberTest {

	@Test
	public void testIsOdd() {
		// fail("Not yet implemented");
		int number = 23;
		MyNumber myNumber = new MyNumber(number);
		assertEquals(true, myNumber.isOdd());
	}
	
	@Test
	public void testIsOddWithEven() {
		// fail("Not yet implemented");
		int number = 22;
		MyNumber myNumber = new MyNumber(number);
		assertEquals(false, myNumber.isOdd());
	}

	@Test
	public void testIsPrime() throws Exception {
		// fail("Not yet implemented");
		int number = 7;
		MyNumber myNumber = new MyNumber(number);
		assertEquals(true, myNumber.isPrime());
	}

	@Test
	public void testIsPrimeWithNonPrime() throws Exception {
		// fail("Not yet implemented");
		int number = 6;
		MyNumber myNumber = new MyNumber(number);
		assertEquals(false, myNumber.isPrime());
	}
	
	@Test
	public void testIsPrimeWithOutOfRange() throws Exception {
		// fail("Not yet implemented");
		int number = -1;
		MyNumber myNumber = new MyNumber(number);
		
		try {
			assertEquals(false, myNumber.isPrime());
			assertTrue(true);
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue(true);
		}
	}
	
	@Test
	public void testIsPrimeWithZero() throws Exception {
		MyNumber myNumber = new MyNumber(0);
		boolean exceptionThrown = false;
		try {
			myNumber.isPrime();
		} catch (Exception e) {
			// TODO: handle exception\
			exceptionThrown = true;
			assertTrue(true);
		}
		if (!exceptionThrown)
			assertTrue(true);
	}

	@Test
	public void testCalculateFactorial() throws Exception {
		MyNumber myNumber = new MyNumber(6);
		int result = myNumber.findFactorial();
		assertEquals(720, result);
	}
	
	
}

