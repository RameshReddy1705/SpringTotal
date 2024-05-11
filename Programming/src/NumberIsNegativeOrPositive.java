import java.util.Scanner;

public class NumberIsNegativeOrPositive
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("Negative");
		}
		if(a>-1)
		{
			System.out.println("positive");
		}
	}

}
