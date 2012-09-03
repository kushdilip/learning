package day4.training;

public class SpecialDog extends Dog{

	/**
	 * @param args
	 */
	
	public String talk() {
		return "Bow Bow!";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialDog hello = new SpecialDog();
		System.out.println(hello.talk());
	}

}
