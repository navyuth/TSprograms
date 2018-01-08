import java.util.*;

public class Test4 
{
public static void main(String args[])
{
	Comparator<Integer> c =  new MyComparator();
	TreeSet<Integer> t = new TreeSet<Integer>(c);
	t.add(200);
	t.add(50);
	t.add(599);
	System.out.println(t);
	
	
}
}

