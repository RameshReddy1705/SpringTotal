package Conn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emp
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee("amesh Reddy",22,150000);
		Employee e2=new Employee("duresh Reddy",45,210000);
		Employee e3=new Employee("camesh Reddy",56,250000);
		Employee e4=new Employee("bahesh Reddy",18,1500);
		
		ArrayList <Employee>la=new ArrayList<Employee>();
		la.add(e1);
		//la.add(null);
		la.add(e2);
		//la.add(null);
		la.add(e3);
		//la.add(e1);
		la.add(e4);
		
		Collections.sort(la,new AgeComp());
		for(Employee e:la)
		{
			System.out.println(e);
		}
		System.out.println(la);

	}
}
