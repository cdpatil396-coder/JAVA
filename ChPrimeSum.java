
import java.util.Scanner;

class ChPrimeSum {

    public static boolean CheckPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int sumOfDigit(int n) {

        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int n = sc.nextInt();

        if (CheckPrime(n)) {
            System.out.println("It is prime no: " + n);

            int result = sumOfDigit(n);

            System.out.println("Sum of digits: " + result);
        }
        else {
            System.out.println("It is not prime no: " + n);
        }

        sc.close();
    }
}
