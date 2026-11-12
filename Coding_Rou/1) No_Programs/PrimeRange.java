import java.util.Scanner;
class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int i;
            if (n < 2)
                continue;
            for (i = 2; i < n; i++) {
                if (n % i == 0)
                    break;
            }
            if (i == n)
                System.out.print(n + " ");
        }
        sc.close();
    }
}