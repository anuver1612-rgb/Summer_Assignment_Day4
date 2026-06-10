import java.util.*;
class q15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i,r,sum=0;
        for(i=n;i!=0;i=i/10)
        {
            r=i%10;
            sum=sum+(r*r*r);
        }
        if(sum==n) System.out.println("ARMSTRONG NUMBER");
        else System.out.println("NOT AN ARMSTRONG NUMBER");
    }
}