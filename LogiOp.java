import java.io.*;

class LogiOp {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Marks: ");
        int marks = Integer.parseInt(br.readLine());

        System.out.println("Enter attendance percentage: ");
        int attendance = Integer.parseInt(br.readLine());

        // Using AND operator
        if (marks >= 75 && attendance >= 80) {
            System.out.println("You are eligible for scholarship");
        }

        // Using OR operator
        else if (marks < 40 || attendance < 60) {
            System.out.println("You are NOT eligible");
        }

        // Using NOT operator
        else if (!(marks < 75)) {
            System.out.println("You passed but not eligible for scholarship");
        }

        else {
            System.out.println("You need improvement");
        }
    }
}