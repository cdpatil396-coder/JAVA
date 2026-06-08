import java.util.Scanner;

class StackArray
{
	int max=5;
	int[] stack = new int[max];
	int top = -1;

 	//push opearation
 	void push(int value)
 	{
		if(top==max -1)
		{
			System.out.println("Stack overflow! Cannot push into stack"+value);
		}
		else
		{	stack[++top]=value;
			System.out.println(value+" Pushed into Stack");
		}
	}
	//pop operation
	void pop()
	{
		if(top ==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(stack[top--]+" Popped from stack");
		}
	}
	//peek operation
	void peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Top element is:"+stack[top]);
		}
	}

	//display operation
	void display()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.println(stack[i]);
			}

		}
	}
	//
}
public class DataStructure
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	StackArray s = new StackArray();
	int choice,value;

	while(true)
	{
		System.out.println("Stack Menu");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.println("4.Display");
		System.out.println("5.Exit");
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
			System.out.println("Invalid choice!");
     	}
 	  }
	}
}

