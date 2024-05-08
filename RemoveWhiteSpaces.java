package Preparation;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str="Java    Programming   Language";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);

	}

}
