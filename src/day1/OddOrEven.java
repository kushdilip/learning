package day1;

public class OddOrEven {
	private int number;

	public OddOrEven(int number) {
		super();
		this.number = number;
	}

	boolean isOdd() {
		boolean result = true;
		if (number % 2 == 0) {
			result = false;
		}
		
		return result;
	}
}
