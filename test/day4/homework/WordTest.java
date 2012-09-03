package day4.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordTest {

	@Test
	public void testCountVowel() {
		// fail("Not yet implemented");
		Word myWord = new Word("Tavant Technologies");
		assertEquals(7, myWord.countVowel());
	}

	@Test
	public void testCountVowelWithNoVowel() {
		Word myWord = new Word("bcdfghjkl");
		assertEquals(0, myWord.countVowel());
	}

	@Test
	public void testContainString() {
		String str = "helloslhellodjladfjhello";
		Word myWord = new Word(str);
		assertEquals(3, myWord.countSubstringCount("hello"));
	}

	@Test
	public void testContainStringWithRepeating() {
		String str = "aaaaaaaaa";
		Word myWord = new Word(str);
		assertEquals(3, myWord.countSubstringCount("aaa"));
	}
	
	@Test
	public void testName() {
		Word myWord = new Word("what is #@@@your name");
		assertEquals(4, myWord.countWords());
	}
}
