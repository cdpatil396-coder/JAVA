import java.util.Scanner;
class Ifelse2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int age;

		System.out.println("Enter your age");
		age = sc.nextInt();

		if(age >= 18){
			System.out.println("your are eligible to vote!!!");
		}
		else{
			System.out.println("you are not eligible!!!");
		}
	}
}