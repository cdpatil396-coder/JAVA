
import java.util.Scanner;

class JavaBasics {
   
public static boolean isPrime(int n){
  if(n<=1){
    return false;
  }
  for(int i=2; i<=Math.sqrt(n); i++){
    if(n%i == 0){
    return false;
    }
  }
  return true;
}

public static int SumOf(int n){
 int sum = 0;

  while (n>0){
    
   int LastDigit = n % 10;            //extract last digit       Ex.123     = 123 - 3 = 3         12 - 2      1 - 1
    sum += LastDigit;                 //Add the last digit                  = 0+3                 3+2 = 5;    5+1 = 6
    n /= 10;                          //remove last digit                   = 3                   2           1
  }
  return sum;
}

public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a no: ");
  int n = sc.nextInt();

  if(isPrime(n)){
 
    System.out.println(+n+ " is the prime no: ");
    int result = SumOf(n);

    System.out.println("The sum of prime no: " +result);

  }
  else{
    System.out.println(+n+ " is not prime no:");
  }
 }
}