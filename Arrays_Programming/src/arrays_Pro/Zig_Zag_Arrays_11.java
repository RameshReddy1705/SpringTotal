package arrays_Pro;

public class Zig_Zag_Arrays_11
{
	public static void main(String[] args)
	{
		RameshReddy rr=new RameshReddy();
		System.out.println("read first array elements");
		int[] a=rr.readArray();
		System.out.println("read second array elements");
		int[] b=rr.readArray();
		System.out.println("Array initilization done");
		rr.dipaly(a);
		System.out.println("done first");
		rr.dipaly(b);
		System.out.println("done second");
		
		int[] c=rr.zigZag(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");

		}
		
	}

}
