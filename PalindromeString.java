package Preparation;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "MADAM";
		String org_str=str;
		int len = str.length();
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev))
			System.out.println(org_str +" Palindrome String");
		else
			System.out.println(org_str + " Not Palindrome String");

	}

}
