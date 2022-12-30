package Assignment29Dec2022;

import java.util.Scanner;
public class ProgramOdd {
	public static void main(String[] args) {
		ProgramOdd p=new ProgramOdd();
		
	 }
	}
class MyThread extends  ProgramOdd
{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		 if(num%2==0)
		 {
			 System.out.println("Number Is Even");
		 }
		 else
		 {
			 System.out.println("Number is Odd");
		 }
	}
  
   

}
