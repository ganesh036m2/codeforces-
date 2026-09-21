import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner oc=new Scanner(System.in);
        int t=oc.nextInt();
        while(t-->0)
        {
            long a=oc.nextLong();
            long b=oc.nextLong();
            long c=oc.nextLong();
            if(a>=b)
            {
                System.out.println(a-b+c);
            }
            else
            {
                long d=b-a;
 
                if(c>d)
                {
                    System.out.println(Math.max(d,c-d));
                }
                else
                {
                    System.out.println(d);
                }
            }
        }
    }
}