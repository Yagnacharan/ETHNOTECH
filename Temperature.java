//Write a Java program to find the highest, lowest, average temperature and hot days from an array of temperatures.

import java.util.*;

public class Temperature
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int[] Temp = {25,30,32,45,47,32,33,26,50,39,30,40,42,28,29,31,35,38,41,44,46,48,49,27,34};
        int n = Temp.length;
        int high = Temp[0];
        int low = Temp[0];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(Temp[i] > high)
            {
                high = Temp[i];
            }

            if(Temp[i] < low)
            {
                low = Temp[i];
            }
            sum += Temp[i];
        }

        double avg = (double)sum / n;

        System.out.println("Highest Temperature: " + high);
        System.out.println("Lowest Temperature: " + low);
        System.out.println("Average Temperature: " + avg);

        System.out.print("Hot Days (Temperature > 35): ");

        for(int i = 0; i < n; i++)
        {
            if(Temp[i] > 35)
            {
                System.out.print(Temp[i] + " ");
            }
        }

        System.out.println();

        x.close();
    }
}