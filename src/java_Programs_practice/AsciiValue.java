package java_Programs_practice;

public class AsciiValue {
//did modifi
	public static void main(String[] args) {
		
		String str="Babasaheb@123";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			System.out.println("Character-"+str.charAt(i)+"-ASCII value-"+(int)str.charAt(i));
		}

	}

}
