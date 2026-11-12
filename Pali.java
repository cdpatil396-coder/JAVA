
import java.util.Scanner;

class Pali {

    public static boolean isPali(int n) {

        int original = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (original == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int n = sc.nextInt();

        if (isPali(n)) {
            System.out.println(n + " is Pali");
        } else {
            System.out.println(n + " is Not Pali");
        }

        sc.close();
    }
}
