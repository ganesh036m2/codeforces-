import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner oc=new Scanner(System.in);
		
		long n=oc.nextLong();
		long q=oc.nextLong();
		
		long flag=0;
		long cnt=0;
		long r=(n+1)/2;
		
		if(q<=r)
		{
		    flag=0;
		    cnt=q;
		    System.out.println(2*cnt-1);
		}
		else
		{
		    flag=1;
		    cnt=q-r;
		    System.out.println(2*cnt);
		}
	}
}