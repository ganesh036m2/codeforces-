import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner oc=new Scanner (System.in);
           long  n=oc.nextLong();
           String s=String.valueOf(n);
           long  cnt=0;
           for(int i=0;i<s.length();i++)
               {
                   if(s.charAt(i)=='4' || s.charAt(i)=='7')
                   {
                       cnt++;
                   }
               }
           if(cnt==4 || cnt==7)
           {
               System.out.println("YES");
           }
           else
           {
               System.out.println("NO");
           }
    }
}