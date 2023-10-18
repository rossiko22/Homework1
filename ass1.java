public class Main {

	public static void main(String[] args) {
		double randomNumber = Math.random() * 100;
		double decimalPart = randomNumber - (int)randomNumber;
		double integerPart = randomNumber - decimalPart;
		char characterPart = (char)randomNumber;
		System.out.println("From 0..100,the computer picked " + randomNumber);
		System.out.println("Integer part of this number is " + integerPart);
		System.out.println("Decimal part of this number is " + decimalPart);
		System.out.println("Character with code: " + integerPart + " is: " + characterPart);
	}

}
