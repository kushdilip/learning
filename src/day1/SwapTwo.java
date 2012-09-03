package day1;

public class SwapTwo {
	private TwoNumbers twoNumbers;

	public SwapTwo(TwoNumbers twoNumbers) {
		super();
		this.twoNumbers = twoNumbers;
	}

	public SwapTwo(int first, int second) {
		super();
		twoNumbers.firstNum = first;
		twoNumbers.secondNum = second;
	}

	public TwoNumbers swap() {
		int temp = twoNumbers.firstNum;
		twoNumbers.firstNum = twoNumbers.secondNum;
		twoNumbers.secondNum = temp;
		return twoNumbers;
	}

}
