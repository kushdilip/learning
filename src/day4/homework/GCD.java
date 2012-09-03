package day4.homework;

public class GCD {
	private int firstNumber;
	private int secondNumber;

	
	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @throws Exception 
	 */
	public GCD(int firstNumber, int secondNumber) throws Exception {
		super();
		if(firstNumber == 0 || secondNumber == 0)
			throw new Exception("GCD not defined for negative numbers");
		
		this.firstNumber = Math.abs(firstNumber);
		this.secondNumber = Math.abs(secondNumber);
	}


	public int findGCD() {
		int temp;
		while (secondNumber != 0) {
			temp = secondNumber;
			secondNumber = firstNumber % secondNumber;
			firstNumber = temp;
		}
		
		return firstNumber;
	}
}
