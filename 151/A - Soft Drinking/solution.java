import java.util.*;
import java.lang.*;
import java.io.*;
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner oc=new Scanner (System.in);
		int  n=oc.nextInt();
        int  k=oc.nextInt();
        int  l=oc.nextInt();
        int  c=oc.nextInt();
        int  d=oc.nextInt();
        int  p=oc.nextInt();
        int  nl=oc.nextInt();
        int  np=oc.nextInt();
        int drink=(k*l)/nl; 
        int lime=c*d; 
        int salt=p/np; 
        int ans=Math.min(drink,Math.min(lime,salt));
        System.out.println(ans/n);
	}
}