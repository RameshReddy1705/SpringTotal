//WAJP TO READ ONE INTEGER VALUE FROM THE USER AND PRINT INTEGER IS SPECIAL TWO DIGIT NUMBER OR NOT?
import java.util.Scanner;
public class SpecialTwoDigitNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n%10;
		int b=n/10;
		int total=a+b+a*b;
		if(total==n)
		{
			System.out.println("Special two digit : "+n);
			
		}
		else
		{
			System.out.println(" Not Special two digit : "+n);
		}
	}

}
