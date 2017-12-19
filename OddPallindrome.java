package myprograms;

public class OddPallindrome {

	public static void main(String[] args) {
		
		int number = 1551,rev;
		
		if(checkAllDigitsOdd(number)){
			rev = reverse(number);
			if(checkPallindrome(number,rev)) {
				System.out.println("Number is Odd Pallindrome");
			}
			else {
				System.out.println("Number is not Odd Pallindrome");
			}
		}
		
	

	}
	
	 public static boolean checkAllDigitsOdd(int number) {
		 
		 int digit;
		 int count =0;
		 
		 while(number >0) {
			 digit = number%10;
			 number = number/10;
			 if(digit%2 == 0) 
			  count++;
		 }
		 if(count == 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 public static int reverse(int number) {
		 int reverse = 0;
		 
		 while(number>0) {
			 int digit = number%10;
			 number = number/10;
			 reverse = reverse * 10 + digit;
			 
		 }
		 return reverse;
	 }
	 public static boolean checkPallindrome(int number,int reverse) {
		 
		 if(number == reverse) {
			 
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

}
