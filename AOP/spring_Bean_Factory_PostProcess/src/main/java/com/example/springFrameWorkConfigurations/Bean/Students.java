package com.example.springFrameWorkConfigurations.Bean;

public class Students
{
	public static void main(String[] args)
	{
		StudentList list=new StudentList(10);
		StudentList list1 = new StudentList(35);
		StudentList list2 = new StudentList(45);
		change(list);
		System.out.println(list.id);
	}

	 static void change(StudentList list)
	 {
		 list.id=list.id+20;
     }
}
class StudentList
{
	static int id;
	StudentList(int id)
	{
		this.id=id;
	}
}
