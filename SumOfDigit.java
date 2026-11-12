import java.util.Scanner;
class SumOfDigit{
    public static int sumOfDigit(int n){         //formal argument  
    int sum = 0;
    while ( n > 0 ){
        int lastDigit = n % 10;                      //Extract last digit
        sum += lastDigit;                        //sum of digits
        n/=10;                                   // ?
    }
    return sum;
    
     }
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();

        int result = sumOfDigit(n);             //actual argument 

        System.out.println("Sum of digits is: " +result);
     }
}