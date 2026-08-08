import java.util.Scanner;
class odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no:");
        int n = sc.nextInt();

        if(n % 2 == 0)
            System.out.println("even no:");
        else
            System.out.println("odd no:");
    }
}