import java.util.*;
class q14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int a=0,b=1,c,i;
        if(n==1) System.out.print("0");
        if(n==2) System.out.print("1");
        else if(n>2)
        {
            for(i=1;i<=n-2;i++)
            {
                c=a+b;
                if(i==n-2) System.out.print(c);
                a=b;
                b=c;
            }
        }
    }
}