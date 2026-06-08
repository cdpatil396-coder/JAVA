import java.io.*;
class ArrayDemo
{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("How many elements");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int [n];
		System.out.println("Enter element into array:");
		for (int i=0; i<n; i++){
			a[i] = Integer.parseInt(br.readLine());
	}
		System.out.println("The entered elements in the array are:");
		for(int i=0; i<n; i++){
			System.out.println(a[i]+"\t");
			}
	}
}