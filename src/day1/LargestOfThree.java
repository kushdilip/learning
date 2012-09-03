package day1;

public class LargestOfThree {
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;

	public LargestOfThree(int firstNum, int secondNum, int thirdNum) {
		super();
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
		this.thirdNumber = thirdNum;
	}

	public int findLargest() {
		int largest = firstNumber;
		if (secondNumber > largest)
			largest = secondNumber;

		if (thirdNumber > largest)
			largest = thirdNumber;

		return largest;
	}
}
