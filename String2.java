import java.util.Scanner;
class String2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String fullname;

		System.out.println("Enter first name middle and last name");
		fullname = sc.nextLine();

		/*name = sc.nextLine();
 		middle = sc.nextLine();
 		last = sc.nextLine();*/

		//System.out.println("Your name is :"+name+" "+middle+" "+last);

		System.out.println("Your full name is : "+fullname);
		sc.close();
	}
}