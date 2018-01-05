import java.util.*;

public class Test4
{
	public static void main(String args[])
	{
		List<Integer> list= new ArrayList<Integer>();
		//System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(52);
		list.add(53);
		list.add(108);
				for(int i= 0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("===========");
		//display all the elements by using for-each
		for(Integer a: list)
		{
			System.out.println(a);
		}
	}
}
