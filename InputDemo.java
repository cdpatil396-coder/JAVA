import java.util.Scanner;
public class InputDemo{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Student Name:");
			String name = sc.nextLine();

			System.out.println("Enter Student Marks:");
			int marks = sc.nextInt();

			System.out.println("Enter Student absent (true/false)");
			boolean ab = sc.nextBoolean();

			System.out.println("Enter Student Percentage:");
			float percentage = sc.nextFloat();


			System.out.println("Student name is:"+(name));
			System.out.println("Student marks is:"+(marks));
			System.out.println("Student present or not:"+(ab));
			System.out.println("Student percentage:"+(percentage));
		}
	}