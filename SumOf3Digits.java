package myproject;

public class SumOf3Digits {

	public static void main(String[] args) {
		int num = 523;
		int digit1 = num% 10;
		int digit3 = num/100;
		
		num = num/10;
		int digit2 = num%10;
		int Sum = digit1  + digit2 + digit3;
		System.out.println("Sum of three digits : "+Sum);

	}

}
