import java.util.Scanner;
class CheckPali{
    public static boolean isPali(int n){
       
       int original = n;
       int rev = 0;

        while(n > 0){
            int rem = n % 10;          // extract last digit 
              rev = rev * 10 + rem;    // print last digit 
              n = n / 10;              // remove the last digit
        }

        if(original == rev){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no: ");
        int n = sc.nextInt();

        if(isPali(n)){
            System.out.println("Is a pali " +n);
        }
        else{
            System.out.println("is Not pali " +n);
        }
    }
}