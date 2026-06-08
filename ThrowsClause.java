import java.io.*;
class ThrowsClause
{
	static void readfile() throws IOException      //declare exception
	{
		FileReader f = new FileReader("abc.txt");
	}
	public static void main(String args[])
	{
		try
		{
			readfile(); //call method
		}
		catch(IOException e)
		{
			System.out.println("Exception handled");
		}
	}
}