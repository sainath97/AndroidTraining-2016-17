import java.lang.*;
import java.util.*;
public class Solution3
{

	public static void main(String args[])
	{
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
            if(str.charAt(i)=='e'||str.charAt(i)=='E')
                count++;
        if(count>=1&&count<=3)
            System.out.print("true");
        else
            System.out.print("false");
	}
}
