import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		//String dec="";
		int dec=0,pw=1;
		do
		{
			int r=n%10;
			dec=dec+r+pw;
			pw=pw*2;
			n=n/10;
		}while(n!=0);
		System.out.println(dec);
		
	}

}
