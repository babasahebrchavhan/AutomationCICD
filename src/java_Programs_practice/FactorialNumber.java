package java_Programs_practice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
		   fact=fact*i;	
		}
		System.out.println("Factorial of Number:"+fact);

	}

}
