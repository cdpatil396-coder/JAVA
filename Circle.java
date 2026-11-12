import java.util.Scanner;

class Circle {  
     public static boolean isPrime(int n){
        
        if(n==2){
            return true;
        }

        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
     }
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("The " +n+ " is Prime: ");
        }
        else{
            System.out.println("The " +n+ " is not prime no:");
        }
     }

    }


