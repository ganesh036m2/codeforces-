import java.util.*;
public class  ganesh {
    public static void main(String[] args)
    {
           Scanner oc=new Scanner (System.in);
            int a=oc.nextInt();
            int b=oc.nextInt();
            int c=oc.nextInt();
            int d=oc.nextInt();
            double  m=(double) a/b;
            double  s=(double) c/d;
            double l=1-m;
            double k=1-s;
            double z=1-(l*k);
            double ans= m/z;
            System.out.println(ans);
 
    }  }