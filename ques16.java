import java.util.*;
class q16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        int i,j,r;
        for(i=1;i<=n;i++)
        {
            int sum=0;
            for(j=i;j!=0;j=j/10)
            {
                r=j%10;
                sum=sum+(r*r*r);
            }
            if(sum==i) System.out.print(i+" ");
        }
    }
}