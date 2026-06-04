//A simple implementation of a browser history using a singly linked list

import java.util.Scanner;

class Node {
    String page;
    Node next;

    Node(String page) {
        this.page = page;
        this.next = null;
    }
}

public class BrowserHistory1 {

    Node head = null;

    // Visit New Page
    void visitPage(String page) {

        Node newNode = new Node(page);

        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Page Visited Successfully");
    }

    // Display Browsing History
    void displayHistory() {

        if (head == null) {
            System.out.println("No Pages Visited");
            return;
        }

        Node temp = head;

        System.out.println("\nBrowsing History:");

        while (temp != null) {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }

    // Search Page
    void searchPage(String key) {

        Node temp = head;

        while (temp != null) {

            if (temp.page.equalsIgnoreCase(key)) {
                System.out.println("Page Found");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Page Not Found");
    }

    // Delete Page
    void deletePage(String key) {

        if (head == null) {
            System.out.println("History Empty");
            return;
        }

        if (head.page.equalsIgnoreCase(key)) {
            head = head.next;
            System.out.println("Page Deleted");
            return;
        }

        Node temp = head;

        while (temp.next != null &&
               !temp.next.page.equalsIgnoreCase(key)) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Page Not Found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Page Deleted");
        }
    }

    // Count Pages
    void countPages() {

        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Pages Visited : " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BrowserHistory1 b = new BrowserHistory1();

        int choice;

        do {

            System.out.println("\n--- Browser History Menu ---");
            System.out.println("1. Visit New Page");
            System.out.println("2. Display History");
            System.out.println("3. Search Page");
            System.out.println("4. Delete Page");
            System.out.println("5. Count Pages");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Page Name : ");
                    String page = sc.nextLine();

                    b.visitPage(page);
                    break;

                case 2:

                    b.displayHistory();
                    break;

                case 3:

                    System.out.print("Enter Page To Search : ");
                    String search = sc.nextLine();

                    b.searchPage(search);
                    break;

                case 4:

                    System.out.print("Enter Page To Delete : ");
                    String delete = sc.nextLine();

                    b.deletePage(delete);
                    break;

                case 5:

                    b.countPages();
                    break;

                case 6:

                    System.out.println("Program Ended");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}