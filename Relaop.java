import java.util.Scanner;
class Relaop{
	public static void main(String args[]){
		System.out.println("Realtional Operators Demonstration:");
		/*Relational Opearators
			1. ==
			2. !=
			3. <
			4. >
			5. <=
			6. >=
		*/

		Scanner sc = new Scanner(System.in);

		//1. less than or equal to
		System.out.println("Enter the Age:");
		int a = sc.nextInt();
		if(a<=18){
			System.out.println("You are not eligible for vote:");
			}
		else{
			System.out.println("You are eligible");
		}
			sc.nextLine();


		//2.equal to  --> ("==").
		System.out.println("Enter the Password ");
		String username = sc.nextLine();
		if(username.equals("admin")){
			System.out.println("Login Successfully!!!");
			}
		else{
			System.out.println("Enter Correct Password!!!");
			}
	}
}