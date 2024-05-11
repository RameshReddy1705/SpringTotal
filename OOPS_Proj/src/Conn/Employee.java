package Conn;

public class Employee
{
	String name;
	int age;
	long sal;
	Employee(String name,int age,long sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	@Override
	public String toString()
	{
		return " =>"+this.name+" ==>"+this.age+" ===>"+this.sal;
	}
}
