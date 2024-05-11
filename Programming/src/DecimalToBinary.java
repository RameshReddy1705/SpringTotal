//WAJP to prnt the decimal to Bianary?/
import java.util.Scanner;
public class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		String bin=" ";
		do
		{
			int d=n%2;
			bin=d+bin;
			
			n=n/2;
		}while(n!=0);
		System.out.println(bin);
	}

}
