import java.util.Scanner;

// Stack class (NOT public)
class StackArray2 {
    int max;
    int[] stack;
    int top;

    // Constructor
    StackArray2(int size) {
        max = size;
        stack = new int[max];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int value = stack[top--];
            System.out.println(value + " popped from stack");
        }
    }

    // Peek operation (optional but useful)
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }
}

// Main class (public, file name should match this)
public class StackUsingArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackArray2 stack = new StackArray2(5);
        int choice, value;
        boolean running = true;

        while (running) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}