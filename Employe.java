
public class Employe implements Comparable<Employe>
{
	int id;
	String name;
	double salary;
	
	
	public Employe(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	@Override
	public int compareTo(Employe o) {
		if(this.id > o.id)
		{
			return 1;
		}
		else if(this.id<o.id)
		{
			return -1;
		}
		else
			return 0;
	}

}
