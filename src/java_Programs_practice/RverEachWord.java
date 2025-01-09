package java_Programs_practice;

public class RverEachWord {

	public static void main(String[] args) {
	
		String str="My Name is Babasaheb";
		String []sptStr=str.split(" ");
		
		String finalStr="";
		
		for(String word:sptStr)
		{
			String rev="";
			for(int i=word.length()-1;i>=0;i--)
			{
				
				rev=rev+word.charAt(i);
			}
			finalStr=finalStr+rev+" ";
			
		}
		System.out.println(finalStr);

	}

}
