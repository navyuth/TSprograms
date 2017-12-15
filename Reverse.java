package myproject;

public class Reverse {

	public static void main(String[] args) {
	
		int number = 254;
		int reverse = 0;
		int digit;
		 
		while(number > 0) {
			
			digit = number % 10;
			number = number / 10;
			reverse = reverse * 10 + digit;
			
		}
		
		System.out.println("Reverse of the given number is : " +reverse);

	}

}
