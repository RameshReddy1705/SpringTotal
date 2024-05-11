import java.util.Scanner;

public class Frequency_Arrays_14
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		int[] ar=new int[n];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		frequencyNumber(ar);
	}
	static void frequencyNumber(int[] br)
	{
		boolean[] rs=new boolean[br.length];
		for (int i = 0; i < br.length; i++)
		{
			if(rs[i]==false)
			{
				int count=1;
				for (int j= i+1; j < rs.length; j++)
				{
					if(br[i]==br[j])
					{
						count++;
						rs[j]=true;
					}
				}
				System.out.println(br[i]+" ==> "+count);
			}
		}
	}

}
