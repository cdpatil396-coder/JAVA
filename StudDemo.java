//write a pgm to accept and display student details.
import java.io.*;
class StudDemo{
public static void main(String[] args)throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   System.out.println("Enter roll no:");
   int rno = integer.parseInt (br.readLine());
   System.out.println("Enter Gender(M/F)");
   char gender = (char)br.read();

   System.out.println("Enter studnet name:");
   String name = br.readLine();
   System.out.println("Roll no:"+rno);
   System.out.println("Gender:"+gender);
   System.out.println("Name:"+name);
  }
}
