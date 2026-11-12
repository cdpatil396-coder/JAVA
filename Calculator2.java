import java.util.Scanner;
class Calculator2{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first no:");
	double a = sc.nextDouble();

	System.out.println("(+,-,*,/): ");
	char op = sc.next().charAt(0);

	System.out.println("Enter second no:");
	double b = sc.nextDouble();

	switch(op){
		case '+':
		System.out.println(a+" + "+b+" Addition is: "+(a+b));
		break;

		case '-':
		System.out.println(a+" - "+b+" subtraction is: "+(a-b));
		break;

		case '*':
		System.out.println(a+" * "+b+" multiplication is: "+(a*b));
		break;

		case '/':
		System.out.println(a+" / "+b+" division is: "+(a/b));
		break;

		default:
		System.out.println("Invalid Operator!!!");
	}
	sc.close();
	}
}