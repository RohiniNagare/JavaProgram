package Preparation;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num=5;
		 
		long factorial=1;
		
		//--logic 1
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		
		/*logic 2
		for(int i=num;i>=1;i--) {
			factorial=factorial*i;
		}	*/
		System.out.println("The factorial of number is "+factorial);

	}

}
