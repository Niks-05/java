import java.util.Scanner;
 class Digit_Sum 
{
    public static void main(String args[])
    {
        int d, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        while(n > 0)
        {
            d = n % 10;
            sum = sum + d;
            n= n / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
