import java.util.Scanner;

// Interface
interface Display {
    void showDetails();
}

// Abstract Class
abstract class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void work();
}

// Inheritance
class Student extends Person implements Display {

    // Encapsulation
    private double marks;

    Student(String name, int age, double marks) {
        super(name, age);
        this.marks = marks;
    }

    // Getter
    public double getMarks() {
        return marks;
    }

    // Setter
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    void work() {
        System.out.println(name + " is studying.");
    }

    @Override
    public void showDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }

    // Method Overloading (Compile-time Polymorphism)
    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String message) {
        System.out.println(message);
    }
}

public class OopsBasic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Object Creation
        Student s = new Student(name, age, marks);

        // Encapsulation using setter
        s.setMarks(marks);

        // Interface method
        s.showDetails();

        // Runtime Polymorphism
        Person p = s;
        p.work();

        // Compile-time Polymorphism
        s.greet();
        s.greet("Welcome to OOP in Java!");

        sc.close();
    }
}