package day1;

import static org.junit.Assert.*;

import org.junit.Test;

import day2.MyNumber;

public class OddOrEvenTest {

	@Test
	public void testIsOdd() {
		// fail("Not yet implemented");
		int number = 23;
		MyNumber myNumber = new MyNumber(number);
		assertEquals(true, myNumber.isOdd());
	}
	
	
}
