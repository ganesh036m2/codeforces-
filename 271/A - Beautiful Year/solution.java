import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner oc=new Scanner (System.in);
		long n=oc.nextInt();
		long l = Integer.MAX_VALUE;
		for(long k=n+1;k<=l;k++)
		{
		   long i=k;
		   long d1=i%10;
		   i=i/10;
		   long d2=i%10;
		   i=i/10;
		   long d3=i%10;
		   i=i/10;
		   long d4=i%10;
           if(d1!=d2 && d2!=d3 && d3!=d4 && d4!=d1 && d1!=d3 && d2!=d4)
           {
               System.out.println(k);
               break;
           }
		}
 
	}
}