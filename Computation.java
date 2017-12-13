package assignment1;

public class Computation {

	public static void main(String[] args) {
		int num,Digit1,Digit2,Sum,Diff;
		num = 52;
		Digit1 = num/10;
		Digit2 = num%10;
		Sum = Digit1 + Digit2;
		Diff = Digit1 - Digit2;
		System.out.println("Sum of two digits = "+Sum+ "\n"+ "Difference of two digits = "+Diff);
		

	}

}
