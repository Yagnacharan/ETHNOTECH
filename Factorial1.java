import java.util.Scanner;

public class Factorial1
{
    public static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int res = factorial(n);

        System.out.println("Factorial of " + n + " is: " + res);

        sc.close();
    }
}