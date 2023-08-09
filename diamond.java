import java.util.Scanner;

 class DiamondOfAlphabets 
  {
    public static void printDiamondPattern(int n)
     {
        for (int i = 0; i < n; i++)
         {
            for (int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) 
	    {
                System.out.print((char) (65 + j));
            }

            for (int j = i - 1; j >= 0; j--)
	    {
                System.out.print((char) (65 + j));
            }

            System.out.println(); 
         }

        for (int i = n - 2; i >= 0; i--) 
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++)
	    {
                System.out.print((char) (65 + j));
            }

            for (int j = i - 1; j >= 0; j--) 
            {
                System.out.print((char) (65 + j));
            }

            System.out.println(); 
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases (N): ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++)
        {
            System.out.print("Enter the value of 'n': ");
            int n = scanner.nextInt();

            if (n > 2 && n < 15)
            {
                printDiamondPattern(n);
            } else
            {
                System.out.println("Value of 'n' should be between 2 and 15 .");
            }
        }

        scanner.close();
    }
}
