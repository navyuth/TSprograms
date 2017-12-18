package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		
		int r= 7;
		
		for(int i=r;i>=1;i--)
		{
			for(int j=r; j>=i;j--)
			{
				System.out.print(j);
			}
		     System.out.println();
		}
}
}
