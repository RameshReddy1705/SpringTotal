import java.util.Scanner;

public class AllMulticationTable
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		for(int i=x;i<=y;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("===============");
		}
	}
}
