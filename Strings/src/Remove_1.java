
public class Remove_1
{
	public static void main(String[] args)
	{
		String s="Ramesh Reddy";
		char ch[]=s.toCharArray();
		int len=s.length();
		remove_1(ch,len);
	}

	static void remove_1(char[] str, int length)
	{
		int index=0;
		for (int i = 0; i < length; i++)   
        {   
              int j;
//            int j;   
//            for (j = 0; j < i; j++)    
//            {   
//                if (str[i] == str[j])   
//                {   
//                    break;   
//                }   
//            }   
//    
//            if (j == i)    
//            {   
//                str[index++] = str[i];   
//            }   
        }
	}
}
