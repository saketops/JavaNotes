package array_questions;

import java.util.Scanner;
//genie 1
public class Sorted_or_not {
	public static void main(String[] args) {
		int arr[]=new int [6];
		int i=0;
		int j=0;
		Scanner sc =new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) 
				{
					System.out.println("not sorted");
					break;
				}
				else
				{
					System.out.println("sorted");
				}
			}
		}
		//again the issue of recurring sorted and not sorted, use boolean 
	//by using bool it will also become o(n) and hint : i and i-1
	
	
	
	
	}

}
