package array;

import java.util.Scanner;
//how to take input of array
public class ArrayProg2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter no for index=" +i);
			int data=sc.nextInt();
			arr[i]=data;
			}
		display(arr);

	}
	public static void display(int arr[]) //to call ststic needed to make it static
	{
		//for each loop
		for(int a:arr) 
			//jis type ka obj nikalna wo likhna and array name
		{
			System.out.println(a);
		}
	}

}
