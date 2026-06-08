import java.util.Scanner;

class QueueArray {

    int queue[];
    int front = -1;
    int rear = -1;
    int max;

    QueueArray(int size) {
        max = size;
        queue = new int[max];
    }

    // Enqueue operation
    void enqueue(int value) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow");
        } 
        else {
            if (front == -1)
                front = 0;

            rear++;
            queue[rear] = value;

            System.out.println(value + " inserted into queue");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } 
        else {
            System.out.println(queue[front] + " removed from queue");
            front++;
        }
    }

    // Display queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } 
        else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueUsingArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        QueueArray q = new QueueArray(size);

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