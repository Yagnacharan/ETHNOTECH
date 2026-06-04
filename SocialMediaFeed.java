
// A simple implementation of a social media feed using a doubly linked list

class Node {
    String post;
    Node next, prev;

    Node(String post) {
        this.post = post;
    }
}

public class SocialMediaFeed {

    public static void main(String[] args) {
        Node p1 = new Node("Instagram Reel");
        Node p2 = new Node("Friend's Photo");
        Node p3 = new Node("Sponsored Ad");
        Node p4 = new Node("YouTube Video");

        p1.next = p2;

        p2.prev = p1;
        p2.next = p3;

        p3.prev = p2;
        p3.next = p4;

        p4.prev = p3;

        System.out.println("Moving Forward Through Feed:\n");
        Node temp = p1;
        while (temp != null) {
            System.out.println(temp.post);
            temp = temp.next;
        }

        System.out.println("\nMoving Backward Through Feed:\n");
        temp = p4;
        while (temp != null) {
            System.out.println(temp.post);
            temp = temp.prev;
        }

        // Insert new post between p2 and p3
        Node newPost = new Node("New Sponsored Post");
        newPost.next = p3;
        newPost.prev = p2;
        p2.next = newPost;
        p3.prev = newPost;

        // Delete p3
        Node toDelete = p3;
        toDelete.prev.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = toDelete.prev;
        }

        System.out.println("\nFeed After Insertion and Deletion:\n");
        temp = p1;
        while (temp != null) {
            System.out.println(temp.post);
            temp = temp.next;
        }
    }
}
