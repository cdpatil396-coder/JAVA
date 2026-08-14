import java.util.Scanner;

public class Conditions{
	public static void main(String [] args){
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter a age:");
   int age = sc.nextInt();

   if(age < 16){
   	System.out.println("You are not eligible to vote:");
   }
   else{
   	System.out.println("You are eligible to vote:");
   }
  }
}