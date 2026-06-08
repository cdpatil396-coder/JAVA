import java.util.Scanner;   // Importing Scanner class for user input

class ProgramStructure      // Class declaration
{
    public static void main(String args[])   // Main method (program execution starts here)
    {
        Scanner sc = new Scanner(System.in); // Creating Scanner object

        int a, b;     // Variable declaration
        int sum, sub, mul, div;

        // Taking input from user
        System.out.println("Enter first number:");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();

        // Arithmetic operations
        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);

        // Logical implementation
        if(a > b && a != 0)
        {
            System.out.println("Logical Result: a is greater than b and a is not zero");
        }
        else
        {
            System.out.println("Logical Result: Condition is false");
        }
    }
}