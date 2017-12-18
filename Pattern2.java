package patterns;

public class Pattern2 {

	public static void main(String[] args) {
		
		int r=7;
		for(int i=1; i<=r;i++)
		{
			for(int j= 1; j<=r-i; j++)
				System.out.print("1");
			
           for(int k=1; k<=i;k++)
           {  
        	   System.out.print(i);
		}
           System.out.println();

	}
	}
}


