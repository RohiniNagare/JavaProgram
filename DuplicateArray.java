package Preparation;

public class DuplicateArray {

	public static void main(String[] args) {
		 
		int a[]= {5,56,89,90,35,47,35};
		
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) 
				{
					System.out.println("Duplicate element in array is "+a[i]);
					flag=true;
				}
	
			}
		}
		if(flag==false) {
			System.out.println("No Duplicate element");
		}

	}

}
