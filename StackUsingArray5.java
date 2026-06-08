import java.util.Scanner;

class StackArray
{
	int max = 5;
	int[] stack = new int[max];
	int top =-1;

	//push operation
	void push(int value)
	{
		if(top==max-1)
		{
			System.out.println("Stack overflow! Cannot push"+value);
		}
		else
		{
			stack[++top]=value;
			System.out.println(value+"Pushed into stack")
		}
	}
}
public class StackUsingArray5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StackArray s = new StackArray();

	}
}