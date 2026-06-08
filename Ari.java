import java.util.Scanner;

class Ari{
	public static void main(String[] arg){
		int i,j;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first no:");
		i = sc.nextInt();

		System.out.println("Enter a second no:");
		j = sc.nextInt();

		System.out.println("Addition of two no is:"+(i+j));
		System.out.println("Subtraction of two no is:"+(i-j));
	}
}