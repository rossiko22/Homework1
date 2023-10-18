public class Main {

	public static void main(String[] args) {
		String name = "Java Developer";
		int lenght = name.length();
		char firstChar = name.charAt(0);
		char lastChar = name.charAt(lenght-1);
		char middleLetter = ' ';
			if(lenght % 2 == 0) {
				middleLetter = name.charAt(lenght / 2);
			}else {
				middleLetter = name.charAt(Math.round(lenght));
			}
		int sum = (int)firstChar + (int)lastChar + (int)middleLetter;
			System.out.println("It's first character is " + firstChar);
			System.out.println("It's last character is " + lastChar);
			System.out.println("It's middle character is " + middleLetter);
			System.out.println("The sum of this characters is " + sum);
			int maxNumber = Math.max(Math.max((int)firstChar, (int)lastChar), (int)middleLetter);
			char maxLetter = (char)maxNumber;
			System.out.println("The biggest character of this three is:	" + maxLetter + " with code of " + maxNumber);
			
	}

}
