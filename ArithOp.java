class ArithOp{
	public static void main(String []args){
		int i=10,j=20;

		System.out.println("ARITHMETIC OPERATOR");
		System.out.println("addtion = "+(i+j));
		System.out.println("subtraction = "+(i-j));
		System.out.println("multiplication = "+(i*j));
		System.out.println("division = "+(i/j));
		System.out.println("modulo = "+(i%j));
		int result = i % j;
		System.out.println("Remainder :"+result);

		System.out.println("RELATIONAL OPERATOR");
		System.out.println("equal to == " +(i==j));
		System.out.println("not equal to = "+(i!=j));
		System.out.println("less than = "+(i<j));
		System.out.println("greater than = "+(i>j));
		System.out.println("less than equal to = "+(i<=j));

		System.out.println(" LOGICAL OPERATOR");
		System.out.println(" && Operator");
			if(m>n && m<o){          //--> false  m = 5 , n = 10 ,0 = 7
				System.out.println("Yes");
			    }
			else{
			    System.out.println("No");
		        }

		int m=5,n=10,o=7;
		System.out.println(" || Operator");
		    if(m>n || m<o){
				System.out.println("Yes");
				}
			else{
				System.out.println("No");
				}

		int x=10, y=18;
		System.out.println(" != Operator"); //--> Yes
			if(m!=n){
				System.out.println("yes");
				}
			else{
				System.out.println("NO");
				}
	}
}