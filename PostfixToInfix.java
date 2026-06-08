import java.util.Stack;
import java.util.Scanner;

public class PostfixToInfix {

    // Function to check if character is operator
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Function to convert postfix to infix
    static String postfixToInfix(String exp) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If operand push to stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            }

            // If operator
            else if (isOperator(c)) {

                String op2 = stack.pop();
                String op1 = stack.pop();

                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Postfix Expression: ");
        String exp = sc.nextLine();

        String result = postfixToInfix(exp);

        System.out.println("Postfix Expression: " + exp);
        System.out.println("Infix Expression: " + result);
    }
}