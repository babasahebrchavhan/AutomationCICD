package java_Programs_practice;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		int num=2322456;
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
			sb.reverse();
		String revnum=sb.toString();
		System.out.println(revnum);
		
		int num1=123456;
		int rev=0;
		while(num1!=0)
		{
			rev=rev*10+num1%10;
			num1=num1/10;
		}
		System.out.println(rev);

     
	}

}
