package Assignment29Dec2022;

import java.util.Scanner;
public class Thread1 {
	public static void main(String[] args) {
		MyThread m=new MyThread();

	 }
	}
class MyThread extends Thread1
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
