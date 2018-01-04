abstract class GenericServ
{
	abstract void calc(int a,int b);
	
}
class HttpServ extends GenericServ
{
	void calc(int a, int b)
	{
		System.out.println("Sum of two numbers: " +(a+b));
	}
	public static void main(String args[])
	{
		GenericServ gs = new HttpServ();
		gs.calc(100,200);
	}
}