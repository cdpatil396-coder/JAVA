import java.util.Scanner;
  class Bounjar{
	  public static void main(String [] args){
		  Scanner sc = new Scanner(System.in);

		  System.out.println("Enter a Button:");
		  int button = sc.nextInt();

		  /*System.out.println("Enter a no:");
		  int button = sc.nextInt();

		  if(button==1){
			  System.out.println("Hello");
			  }
		  else if(button==2){
			  System.out.println("Namaste");
			  }
		  else if(button==3){
			  System.out.println("Bounjar");
			  }
		  else{
			  System.out.println("Invalid Button:");
			  }*/

		  switch(button){
			  case 1 : System.out.println("hello");
			  break;
			  case 2 : System.out.println("Namste");
			  break;
			  case 3 : System.out.println("Bonjour");
			  break;
			  default : System.out.println("Invalid Button:");
			  }
		  }
	  }