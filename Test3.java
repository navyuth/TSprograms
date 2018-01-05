import java.util.*;

public class Test3
{
	public static void main(String args[])
	{
		List<Employe> list= new ArrayList<Employe>();
		//System.out.println(list);
		list.add(new Employe(101,"Navy",30000.00));
		list.add(new Employe(103,"Airforce", 80000.00));
		list.add(new Employe(102,"Gopi",40000.00));
		list.add(new Employe(105,"saad", 50000.00));
		list.add(new Employe(104,"Mouli",25000.00));
		
		
		//display all the elements by using for-each
		for(Employe a: list)
		{
			System.out.println(a);
		}
	}
}
