class Person {
    void displayName() {
        System.out.println("My name is Charan");
    }
}
class Student extends Person {
    void displayCollege() {
        System.out.println("I study at MITS College");
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayName();
        s.displayCollege();
    }
}