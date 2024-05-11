package Conn;

import java.util.Comparator;

public class NameComp implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2)
	{
		String name1=e1.name;
		String name2=e2.name;
		return name1.compareTo(name2);
	}

}
 class salComp implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		long sal1=e1.sal;
		long sal2=e1.sal;
		
		return sal1.compareTo(sal2);
	}

	
}
