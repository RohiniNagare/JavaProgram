package Preparation;

public class MinArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,35,5,100,50};
		
		int min =a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The minimum element in array is "+min);

	}

}
