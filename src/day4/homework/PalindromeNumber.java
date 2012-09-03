package day4.homework;

public class PalindromeNumber implements Palindrome {
	private String myString;

	/**
	 * @param myString
	 */
	public PalindromeNumber(int myNumber) {
		super();
		this.myString = (Integer.toString(myNumber)).toLowerCase();
	}

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
