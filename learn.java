import java.util.Scanner;
import java.io.*;
class learn{
	public static void main(String args[])throws IOException{

		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your roll no:");
		int rno = Integer.parseInt(br.readLine());
		//String name= sc.nextLine();

		System.out.print("Enter your name :");
		String name = br.readLine();

		System.out.println("roll no is: "+rno );
		System.out.println("Name is: "+name);
		}
}