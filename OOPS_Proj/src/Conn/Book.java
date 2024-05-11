package Conn;
public class Book 
{
	Book(){
		System.out.println("09876543");
	}
	void run()
	{
		System.out.println("****");
	}
	
}
class Driver extends Book
{
	Driver d= (Driver)new Book();
}
