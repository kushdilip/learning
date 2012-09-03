package day4.homework;

public class PalindromeString implements Palindrome {
	private String myString;

	/**
	 * @param myString
	 */
	public PalindromeString(String myString) {
		super();
		this.myString = myString.toLowerCase();
	}

	@Override
	public boolean isPalindrome() {
			// TODO Auto-generated method stub
		boolean result = false;

		String reverseString = "";
		for (int i = myString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + myString.charAt(i);
		}

		if (myString.equals(reverseString)) {
			result = true;
		}
		return result;
	}
}
