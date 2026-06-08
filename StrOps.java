class StrOps
{
	public static void main(String args[])
	{
		String str1 = "When1 it comes to web programminng java is no 1";
		String str2 = new String(str1);
		String str3 = "java String are powerful";
		int result;
		System.out.println("Length of str1:"+str1.length());       //1] String class methods 1.int length
		if(str1.equals(str2))
		{
			System.out.println("str1 is equals str2");
		}
		else
		{
			System.out.println("Str1 is not equal str2");
		}
		if(str1.equals(str3))                                       //2.equals
		{
			System.out.println("str1 is equals str3");
    	}
		else
		{
			System.out.println("Str1 is not equal str3");
		}
		result = str1.compareTo(str3);
		if(result == 0)
		{
			System.out.println("str1 and str3 are equal");
		}
		else if(result>0)
		{
			System.out.println("str1 is less than str3");
		}
		else
		{
			System.out.println("str1 is greater than str3");
		}
	}
}