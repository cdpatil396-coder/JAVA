import java.util.Scanner;

class StackArray2 {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    // push operation
    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack is overflow" + value);
        } 
        else 
        {
            stack[++top] = value;
            System.out.println(value + "pushed into stack");
        }
    }

    // pop operation
    void pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack underflow! Stack is empty");
        } 
        else 
        {
            System.out.println(stack[top--]+" popped from stack");
        }
    }

    // Peek operation
    void peek()
    {
         if(top==-1)
    {
         System.out.println("Stack is empty");
    }
    else
    {
        System.out.println("Top element is:"+stack[top]);
    }
}

    // Display operation
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements are:");
            for(int i=top; i>=0; i--)
            {
                System.out.println(stack[i]);
            }
        }
    }
}
public class StackUsingArray4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StackArray2 s = new StackArray2();
        int choice, value;

        while(true)
        {
            System.out.println("STACK MENU");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.display");
            System.out.println("5.exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter value to push:");
                    value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;
                
                case 4:
                    s.display();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("invalid choice!");
            }
        }
    }
}
