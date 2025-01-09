package java_Programs_practice;

public class FirstCharWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to Babasaheb Chavhan";
		
		String str1[]=str.split(" ");
		
			String str2="";
			for(int i=0;i<=str1.length-1;i++)
			{
				str2=str1[i];
				
				 System.out.println(str2.charAt(0));
				
				
			}
		

	}

}
