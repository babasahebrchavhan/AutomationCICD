package java_Programs_practice;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int largest;
		
		if(a>b && a>c)
		{
			largest=a;
			System.out.println(largest);
		}
		if(b>a && b>c)
		{
			largest=b;
			System.out.println(largest);
		}
		else
		{
			System.out.println(c);
		}
		
	}

}
