import java.util.Scanner;

class OddEven{
public static void main(String [] args){

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a no:");
  int num = sc.nextInt();

  if(num % 2 == 0){
    System.out.println(num+"No is even:");
  }
  else{
    System.out.println(num+"Nis odd:");
  }
 }
}