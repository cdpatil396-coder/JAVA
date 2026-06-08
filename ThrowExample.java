class ThrowExample
{
	public static void main(String args[])
	{
		int age = 16;
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");
		}
		System.out.println("Eligible");
	}
}