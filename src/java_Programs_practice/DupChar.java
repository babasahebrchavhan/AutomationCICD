package java_Programs_practice;

import java.util.HashSet;
import java.util.Set;

public class DupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Baaaabasaaaheb";
		Set<Character> set=new HashSet<Character>();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sb.append(c);
			}
		}
		String dup=sb.toString();
		System.out.println(dup);
		
	}

}
