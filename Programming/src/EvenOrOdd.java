import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number : "+a);
		}
		else
		{
			System.out.println("Odd number :" +a);
		}
	}

}