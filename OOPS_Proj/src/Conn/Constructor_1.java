package Conn;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Constructor_1
{
	 String name;
	 int price;
	 int quantity;
	Constructor_1(String name)
	{
		this.name=name;
	}
	Constructor_1(String name,int price)
	{
		this(name);
		this.price=price;
	}
	Constructor_1(String name,int price,int quantity)
	{
		this(name,price);
		this.quantity=quantity;
	}

	
	public String toString()
	{
		return this.name+" "+this.price+" "+this.quantity;
	}
	public static void details(Constructor_1 e)
	{
	
		System.out.println("Name : "+e.name);
		System.out.println("Price : "+e.price);
		System.out.println("Quantity : "+e.quantity);
		System.out.println("...............");
	}
	public static void main(String[] args)
	{
		Constructor_1 con1=new Constructor_1("Ramesh",7896,3);
		Constructor_1 con2=new Constructor_1("Somesh",9582,3);
		Constructor_1 con3=new Constructor_1("Kamesh",85647,3);
		
		con3.details(con3);
		con1.details(con1);
		con2.details(con2);
		System.out.println(con3);
		System.out.println(con1);
		System.out.println(con2);
		
       // LinkedList l = new LinkedList();
        LinkedHashSet l=new LinkedHashSet();
        l.add(con1);
        l.add(con2);
        l.add(con3);
        System.out.println(l);
	}
}
