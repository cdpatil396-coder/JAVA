import java.util.Scanner;
class Swithstring{
	public static void main(String [] args){
	
	String fruit;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a fruit name:");
	fruit = sc.next();
	
	switch(fruit){
	 case "Apple":
	 	System.out.println("You Selectd Apple");
	 	break;
	 case "Mango":
	 	System.out.println("You Selectd Mango");
	 	break;
	 case "Banana":
	 	System.out.println("You Selectd Banana");
	 	break;
	 	
	 default:
	 	System.out.println("Fruit is not available:");
	}
	sc.close();
	}
}