import java.lang.*;
import java.util.*;
public class Solution2
{

	public static void main(String args[])
	{
		String str=new String();
		int n;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		n=sc.nextInt();
		str=str.substring(0,n)+str.substring(n+1);
		System.out.println(str);
	}
}
