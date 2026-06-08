import java.util.Scanner;
class Helllo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int day = sc.nextInt();

		switch (day){
			case 1:
				System.out.println("Monday");
			break;
			case 2:
				System.out.println("Tuesday");
			break;
			default:
				System.out.println("Invalid day");
		}
	}
}