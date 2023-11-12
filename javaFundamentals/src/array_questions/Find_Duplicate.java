package array_questions;

public class Find_Duplicate {
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,1,6,7,8};
		int i=0;
		int j=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("found ditto");
					
				}
				else {
					System.out.println("no ditto");
				}
			}
		}
	}

}
//again use bool to prevent recurring
//one done by me is brute force, 
//the optimised one is hashmap one
//put it on hold, we'll see that in java collections 
//talkin' about third one try it 1:8:00-1:12:00- session 17