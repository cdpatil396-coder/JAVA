import java.util.Scanner;
class Ifelse{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("You passed your exam :(true/false)");
		boolean passed = sc.nextBoolean();

		if(passed){
			System.out.println("Congratulation!!! you passed the exam...");
			}
		else{
			System.out.println("Try next time, you are failed!!!);
			}
			sc.close();
		}
	}