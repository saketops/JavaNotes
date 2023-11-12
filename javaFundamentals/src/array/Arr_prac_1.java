package array;

import java.util.Scanner;

//find max element
public class Arr_prac_1 {
	public static void main(String[] args) {
		
		/*
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];//taken array input
		for(int i=0;i<5;i++) {
		arr[i]=sc.nextInt();
		
		}
		int c=0;
		int max=0;
		
			for(int d=1;d<arr.length;d++)
			if(arr[c]<arr[d]) {
				int temp=arr[c];
				arr[0]=arr[d];
				arr[d]=temp;
			}
			max=arr[0];
			
		
			
		
		System.out.println(max);
		*/
		
		
		//reverse array using while loop
		/*Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];//taken array input
		int i=0;

		int temp=0;
		for( i=0;i<5;i++) {
		arr[i]=sc.nextInt();
		}
	int start =0;
	int end=arr.length-1;
		while(start<end) {
		temp=arr[start];// i am generally making mistake while swapping elements
		arr[start]=arr[end];
		arr[end]=temp;
			start++;
			end--;
			
			
		}
		for(i=0;i<5;i++) {
			System.out.println(arr[i]);//print array
			
		}*/
		//remove duplicates from array
		
		Scanner sc= new Scanner(System.in);
		int array[]=new int[5];
		int i=0;
		for(i=0;i<array.length;i++) {
			System.out.println("enter array vai: ");
			array[i]=sc.nextInt();
		}
		
		
		
	}

}
