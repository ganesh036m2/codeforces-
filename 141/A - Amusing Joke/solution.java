import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner oc=new Scanner(System.in);
 
        String a=oc.nextLine();
        String b=oc.nextLine();
        String c=oc.nextLine();
 
        String x=a+b;
 
        char ar[]=x.toCharArray();
        char br[]=c.toCharArray();
 
        Arrays.sort(ar);
        Arrays.sort(br);
 
        if(Arrays.equals(ar,br))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}