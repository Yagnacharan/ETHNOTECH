import java.util.Scanner;
public class RotArrRight{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=x.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        System.out.println("Enter K Value :");
        int k=x.nextInt();
        k=k%n;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[(i+k)%n]=arr[i];
        }
        System.out.println("Rotated Array:");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        x.close();
    }
}