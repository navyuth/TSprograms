package myproject;

public class Pallindrome {

	public static void main(String[] args) {
		
		int num = 121;
		int temp = num;
		int rev = 0;
		int dig;
		
		while(num > 0) {
			
			dig = num%10;
			num = num/10;
			rev = rev *10 + dig;
		}
		if(rev == temp) {
			
			System.out.println("It is a Pallindrome ");
		}
		
		else {
			
			System.out.println("It is not a pallindrome");
		}

	}

}
