import java.util.Scanner;

interface Payment
{
    void pay(int amount);
}
class UPI implements Payment
{
    public void pay(int amount)
    {
        System.out.println("UPI Payment Successful");
        System.out.println("Amount Paid: Rs." + amount);
    }
}

class Cash implements Payment
{
    public void pay(int amount)
    {
        System.out.println("Cash Payment Successful");
        System.out.println("Amount Paid: Rs." + amount);
    }
}

public class PaymentDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        System.out.println("\nSelect Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Cash");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Payment p;

        if(choice == 1)
        {
            p = new UPI();
        }
        else if(choice == 2)
        {
            p = new Cash();
        }
        else
        {
            System.out.println("Invalid Choice");
            return;
        }

        p.pay(amount);
    }
}