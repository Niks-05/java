import java.util.Scanner;

 class lastfirst
{
    public static void main(String args[])
    {
        int n,f,l,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();

        l=n%10;
        f=0;
        while(n>0)
        {
          f=n%10;
          n=n/10;
        }
        sum=f+l;

        System.out.println("Sum of first and last digit=" +sum );
    }
}