package java_Programs_practice;

import java.util.HashSet;
import java.util.Set;

public class RmvDupChar {

	public static void main(String[] args) {
		
		String str="My Name is Babasaheb Chavhan";
		
		Set<Character> set=new HashSet<Character>();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			Character ch=str.charAt(i);
			if(!set.contains(ch))
			{
				set.add(ch);
				sb.append(ch);
			}
		}
      String dupc=sb.toString();
      
      System.out.println(dupc);

	}

}
