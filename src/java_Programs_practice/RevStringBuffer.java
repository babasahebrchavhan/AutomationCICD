package java_Programs_practice;

public class RevStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Babasaheb";
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sb1=sb.reverse();
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder(str);
		StringBuilder sb3=sb2.reverse();
		System.out.println(sb3);
		
		String str2=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
			
			
		}
		System.out.println("Reverse String-"+str2);
	}

}
