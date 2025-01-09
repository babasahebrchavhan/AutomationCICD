package java_Programs_practice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		
		String str1="vaja";
		String str2="java";
		char char1[]=str1.toCharArray();
		char char2[]=str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		if(Arrays.equals(char1,char2))
		{
			System.out.println("String is Anagram");
			
		}
		else
		{
			System.out.println("String is not Anagram");
		}

	}

}
