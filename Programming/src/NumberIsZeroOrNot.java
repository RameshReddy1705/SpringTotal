import java.util.Scanner;

public class NumberIsZeroOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0)
		{
			System.out.println("Zero");
		}
		if(a!=0)
		{
			System.out.println("not zero");
		}
	}

}
