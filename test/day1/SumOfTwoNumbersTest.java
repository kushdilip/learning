package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfTwoNumbersTest {

	@Test
	public void testSum() {
		//fail("Not yet implemented");
		int firstNum = 10;
		int secondNum = 20;
		SumOfTwoNumbers twoNumbers = new SumOfTwoNumbers(firstNum, secondNum);
		int sum = twoNumbers.sum();
		assertEquals(firstNum+secondNum, sum);
	}
}
