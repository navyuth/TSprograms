
public class Test2
{
	private int id;


 Test2(int id)// constructor
 
{
	 this.id= id;
	

	}
 void DisplayInfo()// method
 {
	 System.out.println(this.id);
 }
}
 class Test1
 {
	 
 
public static void main(String args[])
{
	Test2 t = new Test2(27);//object creation
	t.DisplayInfo();
 }

 
}
