import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> stu = new ArrayList<>();
        stu.add("Charan");
        stu.add("Dinesh");
        stu.add("Ganesh");
        stu.add("SAI");
        System.out.println("Total number of students: " + stu.size());
        System.out.println("List of Students:");
        for (String name : stu) {
            System.out.println("- " + name);
        }
    }
}