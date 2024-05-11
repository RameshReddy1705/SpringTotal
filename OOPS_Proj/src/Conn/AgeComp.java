package Conn;

import java.util.Comparator;

public class AgeComp  implements Comparator<Employee>
{
	 	@Override
	 	public int compare(Employee o1, Employee o2)
	 	{
	 		Integer age1=o1.age;
	 		Integer age2=o1.age;
	 		
	 		return age1.compareTo(age2);
	 	}

	 	
	 

}
