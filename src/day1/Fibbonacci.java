package day1;

public class Fibbonacci {
	private int number;

	public Fibbonacci(int number) {
		super();
		this.number = number;
	}

	private int getFibbonacciRecursively(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return getFibbonacciRecursively(n - 1)
					+ getFibbonacciRecursively(n - 2);
	}

	public int getFibbonacci() {
		return getFibbonacciRecursively(number);
	}

}
