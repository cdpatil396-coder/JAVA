
import java.util.Scanner;

class CheckPrime2 {

    public static boolean CheckPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int n = sc.nextInt();

        if (CheckPrime(n)) {
            System.out.println(n + " is Prime no");
        } else {
            System.out.println(n + " is not Prime no");
        }

        sc.close();
    }
}
