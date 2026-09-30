import java.util.*;
public class  ganesh {
    public static void main(String[] args)
    {
           Scanner oc=new Scanner (System.in);
            int n=oc.nextInt();
            int sum=0;
            int l=1;
            int cnt=0;
            int ans=0;
            while(ans<=n)
            {
                sum+=l;
                ans+=sum;
                l++;
                cnt++;
            }
                System.out.println(cnt-1);
    }  }