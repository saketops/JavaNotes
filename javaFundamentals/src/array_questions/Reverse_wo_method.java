package array_questions;

public class Reverse_wo_method {
	public static void main(String[] args) {
		//with two pointer approach
		//it is basically swapping of values
		int arr[]= {10,30,20,50,40};
		int i=0;
		int temp=0;
		int j=arr.length-1;
		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		for(i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

}
//next time do with method
//sess 17-48:00
