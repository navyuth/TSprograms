package myprograms;

public class PrintValue {

	public static void main(String[] args) {
		
		int number,d;
		number = 34567;
		int r = 0;
		
		while(number>0)
		{
			d = number % 10;
			r = r * 10 + d;
			number = number /10;
			
		}
		
		System.out.println(r);
		

	}

}
