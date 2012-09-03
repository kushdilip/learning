package day2;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		super();
		this.number = number;
	}

	public boolean isOdd() {
		return ((number & 1) != 0) ? true : false;
	}

	public boolean isPrime() throws Exception {
		if (number <= 2)
			throw new Exception("Invalid input: You gave" + number);

		boolean result = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				result = false;
		}

		return result;
	}

	private int findFactorialRecursive(int n) {
		if (n == 1 || n == 0)
			return 1;
		else {
			return n * findFactorialRecursive(n - 1);
		}
	}

	public int findFactorial() throws Exception {
		if (number > 12)
			throw new Exception(
					"Resulting factorial will be too big: You gave " + number);

		return findFactorialRecursive(number);
	}
}
