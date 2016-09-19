import java.lang.*;
import java.util.*;
public class Solution4
{

	public static void main(String args[])
	{
		String str1=new String();
		String str2=new String();
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		int len=str1.length();
		str2=str1.substring(0,len/2)+str2+str1.substring(len/2);
		System.out.println(str2);
	}
}
