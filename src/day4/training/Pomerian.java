package day4.training;

public class Pomerian extends Dog {

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Bow Bow!";
	}
	
	public static void main(String[] args) {
		Pomerian myPomerian = new Pomerian();
		System.out.println(myPomerian.talk());
	}
}
