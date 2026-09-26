import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner oc=new Scanner(System.in);
 
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=oc.nextInt();
                b[i][j]=1;
            }
        }
 
        int[] x={0,-1,1,0,0};
        int[] y={0,0,0,-1,1};
 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]%2!=0)
                {
                    for(int k=0;k<5;k++)
                    {
                        int ni=i+x[k];
                        int nj=j+y[k];
 
                        if(ni>=0 && ni<3 && nj>=0 && nj<3)
                        {
                            b[ni][nj]=1-b[ni][nj];
                        }
                    }
                }
            }
        }
 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}