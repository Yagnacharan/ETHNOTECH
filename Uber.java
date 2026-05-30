import java.util.Scanner;
abstract class UberBooking
{
    public abstract void bikeBooking(int cost,int have);
    public abstract void carBooking(int cost,int have);
    public abstract void autoBooking(int cost,int have);
}
class Booking extends UberBooking
{
    public void bikeBooking(int cost,int have)
    {
        if(have>=cost)
        {
            System.out.println("Bike can be booked with the available amount");
        }
    }
    public void carBooking(int cost,int have)
    {
        if(have>=cost)
        {
            System.out.println("Car can be booked with the available amount");
            return;
        }
    }
    public void autoBooking(int cost,int have)
    {
        if(have>=cost)
        {
            System.out.println("Auto can be booked with the available amount");
            return;
        }
    }
}
public class Uber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int have=sc.nextInt();
        Booking book=new Booking();
        book.carBooking(200,have);
        book.autoBooking(150,have);
        book.bikeBooking(100,have);
        sc.close();
    }
}