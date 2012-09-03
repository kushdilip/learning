package day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoNumbersTest {

	@Test
	public void testSwap() {
//		fail("Not yet implemented");
		int[] array = new int[2];
		array[0] = 1;
		array[1] = 2;
		TwoNumbers twoNumbers = new TwoNumbers(array);
		array = twoNumbers.swap();
		assertEquals(2, array[0]);
		assertEquals(1, array[1]);
	}

}
