package array_questions;

import java.util.Scanner;

public class Second_highest {
	public static void main(String[] args) {
		int arr[]=new int[6];
		int i=0;
		int j=0;
		int temp=0;
		int highest=0;
		int sec_highest=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				continue;
			}
			else {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			highest=arr[i];
		
		}
		
		System.out.println(highest);
		
		//need to solve this also again
		
	}

}
