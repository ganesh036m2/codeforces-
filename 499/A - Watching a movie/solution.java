import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner oc=new Scanner(System.in);
        int n=oc.nextInt();
        int x=oc.nextInt();
        int curr=1;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int l=oc.nextInt();
            int r=oc.nextInt();
            curr+=((l-curr)/x)*x;
            ans+=(r-curr+1);
            curr=r+1;
        }
        System.out.println(ans);
    }
}