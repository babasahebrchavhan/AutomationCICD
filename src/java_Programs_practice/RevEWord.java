package java_Programs_practice;

public class RevEWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is Babasaheb Chavhan";
		
		String str1[]=str.split(" ");
		String revString="";
		for(String s:str1)
		{
			 String revWord="";
			 for(int i=s.length()-1;i>=0;i--)
			 {
				 revWord=revWord+s.charAt(i);
				 
			 }
			 revString=revString+revWord+"";
		}
		System.out.println(revString);
	}

}
