import java.util.Scanner;

public class ElecBill {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = x.nextInt();

        int bill = 0;

        if (units >= 250) {
            int slabs = (units - 250) / 50;

            // bill = slabs * 50
            bill = (slabs << 5) + (slabs << 4) + (slabs << 1);
            // 32 + 16 + 2 = 50
        }

        System.out.println("Electricity Bill = Rs." + bill);

        x.close();
    }
}