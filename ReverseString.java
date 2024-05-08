package Preparation;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "ABCD";
		String rev = "";
		
		
		//Logic 1 : Using String Concatenation
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
	
		
		/*//Logic 2 : Using Character Array
		
		char a[]=str.toCharArray();
		int len = a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + a[i];
		} */
		
		
		System.out.println("Reverse String is : "+rev);
		
		
		/*//Logic 3 : Using StringBuffer class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());   */
		
	}

}
