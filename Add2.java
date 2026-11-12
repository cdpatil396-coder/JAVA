
import java.util.Scanner;

class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, result;

        System.out.println("Enter first no and second no:");
        a = sc.nextInt();
        System.out.println("+");
        b = sc.nextInt();

        result = a + b;

        System.out.println("The sum is " + result);

        sc.close();
    }
}
