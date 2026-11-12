import java.util.Scanner;

class Practice{
   public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = sc.nextInt();

        System.out.println("Enter ending ");
        int end =sc.nextInt();

        for(int n = start; n<=end; n++){
            int count = 0;
            for(int i =1; i<=n; i++){
                if(n%i == 0)
                count++;
            }
            if(n>1 && count == 2)
                System.out.println(n+" ");
        }
   }
}
