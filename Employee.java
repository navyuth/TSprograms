
public class Employee {

	int id;
	String name;
	double Salary;


public static void main(String args[])
{
	
	
	Employee emp1 = new Employee();
	emp1.id = 1001;
	emp1.name = "Navyuth";
	emp1.Salary = 60000.00;
	
	System.out.println("EID:" +emp1.id+ "\n"
						+"ENAME:" +emp1.name +"\n" 
						+"ESALARY:" +emp1.Salary);
	System.out.println("---------------");
	
	Employee emp2 =  new Employee();
	emp2.id = 1002;
	emp2.name = "Sudheer";
	emp2.Salary = 50000.00;

	System.out.println("EID:" +emp2.id+ "\n"
						+"ENAME:" +emp2.name +"\n" 
						+"ESALARY:" +emp2.Salary);
	System.out.println("---------------");
	

    }
}
