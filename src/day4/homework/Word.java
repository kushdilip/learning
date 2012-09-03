package day4.homework;

public class Word {
	private String myWordString;

	/**
	 * @param myWordString
	 */
	public Word(String myWordString) {
		super();
		this.myWordString = myWordString.toLowerCase();
	}

	public int countVowel() {
		int count = 0;
		char ch = '\0';
		for (int i = 0; i < myWordString.length(); i++) {
			ch = myWordString.charAt(i);

			switch (ch) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			default:
				break;
			}
		}

		return count;
	}

	public int countSubstringCount(String findString) {
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {
			lastIndex = myWordString.indexOf(findString, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += findString.length();
			}
		}
		return count;
	}

	public int countWords() {
		String s = myWordString;
		int counter = 0;

		boolean isWord = false;
		int endOfLine = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)) == true && i != endOfLine) {
				isWord = true;
			} else if (Character.isLetter(s.charAt(i)) == false
					&& isWord == true) {
				counter++;
				isWord = false;
			} else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
				counter++;
			}
		}
		return counter;
	}
}
