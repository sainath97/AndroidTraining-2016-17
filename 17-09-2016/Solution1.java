import java.lang.*;
import java.util.*;
public class Solution1
{
	
	public static void main(String args[])
	{
		String str=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
		str=str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
		System.out.println(str);
	}
}
