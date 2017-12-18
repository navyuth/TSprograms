package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		
		int r=7;
		for(int i=0;i<=r;i++)
		{
			for(int j=1;j<=r-i;j++)
				System.out.print(j);
			System.out.println();
		}
		

	}

}
