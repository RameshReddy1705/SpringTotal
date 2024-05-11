import java.util.Scanner;

public class NumberIsDigitOrNot
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		
		if(x<=-9||x<=9)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("not");
		}
	}
}
