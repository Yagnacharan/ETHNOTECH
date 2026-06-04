import java.util.Scanner;
public class JaggedArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int[][] marks=new int[3][];
        marks[0]=new int[2];
        marks[1]=new int[4];
        marks[2]=new int[3];
        for(int i=0;i<marks.length;i++) {
            for(int j=0;j<marks[i].length;j++) {
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<marks.length;i++) {
            System.out.print((i+1)+" Student: ");
            for(int j=0;j<marks[i].length;j++) {
                System.out.print(marks[i][j]+ " ");
            }
            System.out.println();
        }
    }
}