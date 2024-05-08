package Preparation;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "Welcome to java";
		
		String[] words=str.split(" ");
		
		String revString = "";
		
		for(String w : words) {
			
			String revWords="";
			
			for(int i=w.length()-1;i>=0;i--) {
				revWords = revWords + w.charAt(i);
			}
			revString = revString + revWords + " ";
		}
		System.out.println(revString);
		
		
		/* //Logic 2: Using StringBuilder class
		String revWords="";
		for(String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			revWords= revWords + sb.toString()+" ";
		}
		System.out.println(revWords);	 */
	}

}
