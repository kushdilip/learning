package day4.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testIsPalindrome() {
		// fail("Not yet implemented");
		Palindrome myPalindrome = new PalindromeString("Malayalam");
		assertEquals(true, myPalindrome.isPalindrome());
	}
	
	@Test
	public void testIsPalindromeWithNoPalindrome() {
		Palindrome myPalindrome = new PalindromeString("Dilip");
		assertEquals(false, myPalindrome.isPalindrome());
	}
	
	@Test
	public void testIsPalindromeWithNumber() {
		Palindrome myPalindrome = new PalindromeNumber(12321);
		assertEquals(true, myPalindrome.isPalindrome());
	}
}
