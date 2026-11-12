import java.util.Scanner;
class LoopDsa{
    //function for sum of n natural no 
    public static int SumNatural(int n){             //formal aruguments
        int i = 1;
        int sum = 0;
        while (i<=n){
            sum+=i;
            i++;
        }
        return sum;
    }

    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a no: ");
        // int n = sc.nextInt();

        // int result = SumNatural(n);                  //Actual arguments

        // System.out.println("The Sum of Natural no is: "+result);

        int result = SumNatural(3);             
        System.out.println(result);
    }

    
}