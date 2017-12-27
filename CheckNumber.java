package myprograms;

public class CheckNumber {

	public static void main(String[] args) {
		
		int num = 28;
		int s = 0;
		
		for(int i =1; i<=num/2;i++)
		{
			if(num % i == 0)
			{
				s = s+i;
			}
		}
		if(num == s)
		{
			System.out.println("Perfect");
		}
		else 
		{
			System.out.println("Not Perfect");
		}
	}

}
