import java.util.Scanner;  // ✅ Import Scanner class

public class first {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter Number");

        Scanner s = new Scanner(System.in);  // ✅ Scanner should start with capital 'S'
        a = s.nextInt();

        System.out.println(a);

        s.close();  // ✅ Always close Scanner to avoid resource leak
    }
}
