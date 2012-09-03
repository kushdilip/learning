package day4.homework;

import java.util.ArrayList;

public class MyNumberRange {
	private int low, high;

	/**
	 * @param number
	 * @param myArray
	 */
	public MyNumberRange(int low, int high) {
		this.low = low;
		this.high = high;
	}

	private boolean isPrime(int number) throws Exception {
		boolean result = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				result = false;
		}

		return result;
	}

	public int[] getPrimes() throws Exception {
		ArrayList<Integer> primeInRange = new ArrayList<Integer>();
		int[] primes;

		if (low > high)
			throw new Exception("Improper Range");
		
		if (high < 2)
			throw new Exception(
					"Prime number not defined for numbers less than " + 2);
		
		if(low < 2)
			low = 2;
		
		for (int i = low; i <= high; i++) {
			if (isPrime(i))
				primeInRange.add(i);
		}

		primes = new int[primeInRange.size()];

		for (int i = 0; i < primeInRange.size(); i++) {
			primes[i] = primeInRange.get(i);
		}
		return primes;

	}

}
