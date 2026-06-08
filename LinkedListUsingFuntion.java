import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class LinkedList {

    Node head = null;

    // Insert at beginning
    void insertBegin(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at position
    void insertPosition(int value, int pos) {
        Node newNode = new Node(value);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at beginning
    void deleteBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // Delete at end
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete at position
    void deletePosition(int pos) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    // Count nodes
    void count() {
        int c = 0;
        Node temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }

        System.out.println("Total nodes: " + c);
    }

    // Search element
    void search(int value) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Element found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }

        System.out.println("Element not found");
    }

    // Display list
    void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Linked List: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

public class LinkedListUsingFuntion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int ch, val, pos;

        do {
            System.out.println("\n1.Insert Begin");
            System.out.println("2.Insert End");
            System.out.println("3.Insert Position");
            System.out.println("4.Delete Begin");
            System.out.println("5.Delete End");
            System.out.println("6.Delete Position");
            System.out.println("7.Count");
            System.out.println("8.Search");
            System.out.println("9.Display");
            System.out.println("10.Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    list.insertBegin(val);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    list.insertEnd(val);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    list.insertPosition(val, pos);
                    break;

                case 4:
                    list.deleteBegin();
                    break;

                case 5:
                    list.deleteEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    list.deletePosition(pos);
                    break;

                case 7:
                    list.count();
                    break;

                case 8:
                    System.out.print("Enter element to search: ");
                    val = sc.nextInt();
                    list.search(val);
                    break;

                case 9:
                    list.display();
                    break;

                case 10:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 10);
    }
}