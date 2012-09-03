package day2;

public class TwoNumbers {
	private int[] myNumbers;

	public TwoNumbers(int[] myNumbers) {
		super();
		this.myNumbers = myNumbers;
	}

	public int[] swap() {
		int temp = myNumbers[0];
		myNumbers[0] = myNumbers[1];
		myNumbers[1] = temp;

		return this.myNumbers;
	}

}
