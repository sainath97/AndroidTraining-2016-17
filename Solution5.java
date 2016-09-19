import java.lang.*;
import java.util.*;
public class Solution5
{

	public static void main(String args[])
	{
		String str1=new String();
		String str2=new String();
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		String str3=new String();
		str3="<"+str1+">"+str2+"<"+str1+">";
		System.out.println(str3);
	}
}
