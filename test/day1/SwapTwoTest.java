package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwapTwoTest {

	@Test
	public void testSwap() {
//		fail("Not yet implemented");
		int firstNum = 10;
		int secondNum = 20;
		TwoNumbers twoNumbers = new TwoNumbers(firstNum, secondNum);
		SwapTwo swapTwo = new SwapTwo(twoNumbers);
		twoNumbers = swapTwo.swap();
		assertEquals(20, twoNumbers.firstNum);
		assertEquals(10, twoNumbers.secondNum);
	}

}
