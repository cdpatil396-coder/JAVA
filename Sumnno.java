import java.util.Scanner;
class Sumnno{
    public static void main(String [] args){
  	    Scanner sc = new Scanner(System.in);

  	    System.out.println("Enter a no:");
        int n = sc.nextInt();
   /*
        int sum = 0;
   		for (int i=1; i<=n; i++){
			 sum = sum+i;
       	 }
       	   System.out.println(sum+" Sum of "+n+" numbers");
   */
         for (int i=1; i<11; i++){
			System.out.println(i*n);
 			}
     }
}