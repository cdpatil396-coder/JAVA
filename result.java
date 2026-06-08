import java.util.Scanner;

class result{
	public static void main(String[] args){
		int sub1=67 ,sub2=78 , sub3=89,sub4=92,sub5=95;

		int total = sub1+sub2+sub3+sub4+sub5;
		double percentage = (total * 100.0) / 500;

		System.out.println("The total subject marks is:"+total);
		System.out.println("percentage = "+percentage);
		}
	}