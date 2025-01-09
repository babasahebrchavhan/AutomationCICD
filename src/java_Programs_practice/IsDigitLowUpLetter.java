package java_Programs_practice;

public class IsDigitLowUpLetter {

	public static void main(String[] args) {

    String str="My name is Babasaheb 123";
    
    for(int i=0;i<=str.length()-1;i++)
    {
    	
    	char c=str.charAt(i);
    	if(Character.isDigit(c))
    	{
    		System.out.println("Digit-"+c);
    		
    	}
    	if(Character.isLetter(c))
    	{
    		System.out.println("Letter-"+c);
    	}
    	if(Character.isLowerCase(c))
    	{
    		System.out.println("LowerCase-"+c);
    	}
    	if(Character.isUpperCase(c))
    	{
    		System.out.println("isUpperCase-"+c);
    	}
    	if(Character.isSpaceChar(c))
    	{
    		System.out.println("isSpaceChar-"+c);
    	}
    
    }

	}

}
