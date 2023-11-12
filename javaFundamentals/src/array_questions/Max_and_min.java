package array_questions;

public class Max_and_min {
	public static void main(String[] args) {
		int arr[]= {2,78,34,82, 59};
		int i=0;
		int j=0;
		int temp=0;
		int highest=0;
		int minimum =0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

					
				}
			}
			highest = arr[0];//set highest after sorting
			
			
		}
		System.out.println("maximum" + highest);
		
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

					
				}
			}
			minimum= arr[0];//set minimum after sorting
			
			
		}
		System.out.println("maximum" + minimum);
		
		
		
		
		
		}

}

