package day1;

public class Factorial {
	private int number;

	public Factorial(int number) {
		super();
		this.number = number;
	}

	private int getFactorialRecursive(int n) {
		if (n < 0)
			throw new RuntimeException("Valid for only non-negative numbers");
		if (n == 1 || n == 0)
			return 1;
		else {
			return n * getFactorialRecursive(n - 1);
		}
	}

	public int getFactorial() {
		return getFactorialRecursive(number);
	}
}
