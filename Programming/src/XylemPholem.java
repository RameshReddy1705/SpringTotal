//WAJP to print Xylem or Pholem Number??
import java.util.Scanner;
public class XylemPholem
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		int esum=0,osum=0,temp=n;
		do
		{
			int d=n%10;
			if(n==temp||n==d)
			{
				esum=esum+d;
			}
			else
			{
				osum=osum+d;
			}
			n=n/10;
		}while(n!=0);
		if(esum==osum)
		{
			System.out.println("Xylem");
		}
		else
		{
			System.out.println("Pholem");
		}
	}

}
