import java.util.*;
class q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range n:");
        int n=sc.nextInt();
        int a=0,b=1,c,i;
        if(n==1) System.out.print("0");
        if(n==2) System.out.print("0,1");
        else if(n>2)
        {
            System.out.print(a+","+b);
            for(i=1;i<=n-2;i++)
            {
                c=a+b;
                System.out.print(","+c);
                a=b;
                b=c;
            }
        }
    }
}