public class ShowLogicErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Celsius 35 is Fahrenheit degree ");
		//We changed fraction from 9/5 to 9.0/5.0 so it doesn't round down and is more specific
		//9/5 would cause answer to be 67 incorrect
		//9.0/5.0 would cause answer to be 95 correct
		System.out.println((9.0 / 5.0) * 35 + 32);
	}
}