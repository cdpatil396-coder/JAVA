class ExceptionExample
{
	public static void main(String args[])
	{
		try
		{
			int a = 10;
			int b = 2;
			int c = a/b;
			System.out.println("Result is :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divided by zero");
		}
		finally
		{
			System.out.println("Finally Block executed");
		}
	}
}