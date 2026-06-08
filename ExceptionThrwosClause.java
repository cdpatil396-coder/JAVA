import java.util.Scanner;
import java.io.*;
class ExceptionThrwosClause
{
	void accept()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("hello"+name);
	}
}
class ExceptionNotHandle
{
	public static void main(String args[])throws IOException
	{
		ExceptionThrwosClause s = new ExceptionThrwosClause();
		s.accept();
	}
}