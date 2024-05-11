package Conn;

import java.util.ArrayList;
import java.util.Collection;

public class Bank_Account_1
{
	String name;
	long acNo;
	int pin;
	
	Bank_Account_1(String name)
	{
		this.name=name;
	}
	Bank_Account_1(String name,long acNo)
	{
		this(name);
		this.acNo=acNo;
	}
	Bank_Account_1(String name,long acNo,int pin)
	{
		this(name,acNo);
		this.pin=pin;
	}
	public int getPin()
	{
		return pin;
	}
	public int setPin(int pin)
	{
		return pin;
	}
	
//	public String toString()
//	{
//		return this.name+"==>Name "+this.acNo+" ==>acNo  "+this.pin+" ==>pin ";
//	}
	public static void main(String[] args)
	{
		Bank_Account_1 b1=new Bank_Account_1("Ramesh ",558261,9705);
		Bank_Account_1 b2=new Bank_Account_1("asdfg ",970561,975);
		Bank_Account_1 b3=new Bank_Account_1("kjhggfdh ",96328261,705);
		Bank_Account_1 b4=new Bank_Account_1("qwert",85201461,705);

//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b4);
//		System.out.println(b3);
//		System.out.println(".............");
//		
//		System.out.println(b1.getPin());
//		System.out.println(b1.setPin(8520));
//		System.out.println(b2);
//		
//		System.out.println(b2.getPin());
//		System.out.println(b2.setPin(8654));
//		System.out.println("==============");
//		Scanner sc=new Scanner(System.in);
//		ArrayList a1=new ArrayList();
//		a1.add(b1);
//		
//		
//		System.out.println(b1);
		
		
		

		System.out.println("==============");
	   Constructor_1 v= new Constructor_1("Ramesh",7896,3);
		Collection []x= {b1,b2,b3,b4,v};
		ArrayList<Object> o=new ArrayList<Object>();
		o.add(b1);
		o.add(b2);
		o.add(b3);
		o.add(v);
		System.out.println("***");
		System.out.println(o);
		
		

	}

}
