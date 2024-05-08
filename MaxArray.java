package Preparation;

import java.util.Arrays;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {43,12,56,8,1};
		
		/* Logic 1
		Arrays.sort(arr);
		int x=arr.length-1;
		System.out.println(arr[x]);
		*/
		
		
		//Logic 2
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Element in array is "+ max);
	}

}
