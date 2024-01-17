import java.util.Scanner;

 class LeapYear 
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0)
         {
           System.out.print("leap year ");

          }
        else 
          {
               System.out.println( "  not a leap year.");
 
          }
       
    }
}
