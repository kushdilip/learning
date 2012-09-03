package day1;

public class PrimeCheck {
	private int number;

	public PrimeCheck(int number) {
		super();
		this.number = number;
	}

	public boolean isPrime() {
		for (int i = 2; i <= (int)Math.sqrt((double) number); i++) {
			if (number % i == 0)
				return false;
		}

		return true;
	}

}
