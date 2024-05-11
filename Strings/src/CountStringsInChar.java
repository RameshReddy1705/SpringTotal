import java.util.Scanner;

public class CountStringsInChar
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		
		int C=0,S=0,N=0,sp=0;
		//char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				C++;
				
			}
			else if(ch>='a'&&ch<='z')
			{
				S++;
				
			}
			else if(ch>='0'&&ch<='9')
			{
				N++;
		
			}
			else
			{
				sp++;
				
			}
		}
		System.out.println("Upper-->"+C);
		System.out.println("Lower-->"+S);
		System.out.println("Number-->"+N);
		System.out.println("Special-->"+sp);
	}

}
