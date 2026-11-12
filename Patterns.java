import java.util.Scanner;
class Patterns{
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            //inner columns
            for(int j=1; j<=totCols; j++){
                //cell - (i--> rows, j--> columns)
                if(i==1 || i == totRows || j==1 || j==totCols){
                //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();

        }
     }
    public static void main(String [] args){

        //Without user input 
        //hollow_rectangle(4,5);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int totRows = sc.nextInt();

        System.out.print("Enter columns: ");
        int totCols = sc.nextInt();

        hollow_rectangle(totRows,totCols);
 
    }
}
