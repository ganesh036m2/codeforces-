import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner oc=new Scanner (System.in);
		int t=oc.nextInt();
		while(t-->0)
		{
		  int l=oc.nextInt();
		  int k[]=new int [3];
		  for(int i=0;i<3;i++)
		  {
		      k[i]=oc.nextInt();
		  }
		  int ans=l+1;
		  for(int i=0;i<3;i++)
		  {
		      ans=Math.min(ans,k[i]);
		  }
		  int fans=l-ans;
		  System.out.println(fans);
		}
 
	}
}