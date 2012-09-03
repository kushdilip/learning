package day4.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyNumberRangeTest {

	@Test
	public void testGetPrimes() throws Exception {
		// fail("Not yet implemented");
		MyNumberRange range = new MyNumberRange(10, 20);
		assertArrayEquals(new int[] { 11, 13, 17, 19 }, range.getPrimes());
	}

	@Test
	public void testGetPrimeWrongRange() throws Exception {
		MyNumberRange range = new MyNumberRange(10, 5);
		try {
			range.getPrimes();
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue(true);
		}
	}
}
