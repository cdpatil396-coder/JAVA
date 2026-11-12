import java.util.Scanner;
class JavaEx{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int a = sc.nextInt();
        System.out.println("Enter a second no:");
        int b = sc.nextInt();

        int result = a+b;
        System.out.println("Sum is "+ result );

    }
}