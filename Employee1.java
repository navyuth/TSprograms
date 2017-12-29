
public class Employee1 {
	int id;
	String name;
	double Sal;
	
	Employee1(int id, String name, double Sal)
	{
		System.out.println("Object Created");
		this.id = id;
		this.name = name;
		this.Sal = Sal;
	}

	public static void main(String[] args)
	{
		
		int id[] = {1001,1002};
		String name[] = {"Navyuth","Sudheer"};
		double Sal[] = {30000.00,40000.00};
		
		for(int i = 0; i<2;i++)
		{
			System.out.println("Employee Information");
			Employee1 emp = new Employee1(id[i],name[i],Sal[i]);
			System.out.println("EID :"+emp.id+ "\n" +"ENAME :"+emp.name+ "\n" +"ESAL :"+emp.Sal);
		
		System.out.println("===============");
		}
		
	}

}
