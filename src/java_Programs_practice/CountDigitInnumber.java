package java_Programs_practice;

import java.util.Scanner;

public class CountDigitInnumber {

	public static void main(String[] args) {
		
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count of Digit-"+count);

	}

}
