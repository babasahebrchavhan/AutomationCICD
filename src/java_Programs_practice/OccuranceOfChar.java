package java_Programs_practice;

import java.util.Map;
import java.util.TreeMap;

public class OccuranceOfChar {

	public static void main(String[] args) {
		
		String str="My name is Babasaheb";
		TreeMap<Character,Integer> map=new TreeMap<Character, Integer>();
		
		for(int i=0;i<str.length()-1;i++)
		{
			Integer c=map.get(str.charAt(i));
			if(map.get(str.charAt(i))==null)
			{
				map.put(str.charAt(i),1);
			}
			else
			{
				map.put(str.charAt(i), ++c);
			}
		}

		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
