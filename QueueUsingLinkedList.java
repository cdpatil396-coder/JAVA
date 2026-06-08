import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class QueueLinkedList {

    Node front = null;
    Node rear = null;

    // Enqueue operation
    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } 
        else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted into queue");
    }

    // Dequeue operation
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " removed from queue");
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Display queue
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueLinkedList q = new QueueLinkedList();

        int ch, val;

        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 4);
    }
}