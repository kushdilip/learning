package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestOfThreeTest {

	@Test
	public void testFindLargest() {
//		fail("Not yet implemented");
		int firstNum = 10;
		int secondNum = 9;
		int thirdNum = 12;
		
		LargestOfThree largestOfThree = new LargestOfThree(firstNum, secondNum, thirdNum);
		int largest = largestOfThree.findLargest();
		assertEquals(12, largest);
	}

}
