import java.util.Random;
import java.util.Scanner;

public class Password
{
	public static void main(String[] args)
	{
		String letters="abcdefghijklmnopqrstuvwxyz";
		String Letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers="0123456789";
		String specialChar="!@#$%^&*()_+}{~";
		
		String Connection =letters+Letters+numbers+specialChar;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int length=sc.nextInt();
		char[] password=new char[length];
		Random r=new Random();
		for(int i=0;i<length;i++)
		{
			password[i]=Connection.charAt(r.nextInt(Connection.length()));
		}
		System.out.println("Password : "+new String(password));
	}

}
