/*package array_questions;

import java.util.Scanner;

public class Product_except_self {
public static void main(String[] args) {
	//array input taken
	int nums[]=new int[6];
	int i=0;
	System.out.println("enter an array");
	Scanner sc= new Scanner(System.in);
	for(i=0;i<nums.length;i++) {
		
	nums[i]=sc.nextInt();
	
	}
	int arr2[]=new int[6];
	int prod=1;
	int val=0;
	int j=0;
	for(i=0;i<nums.length;i++) {
		for(j=0;j<nums.length;j++) {
			if(i==j) {
				continue;
			}
			prod*=nums[j];
		
		}
		nums[i]=prod;

		System.out.println(prod);	
	}
	// in my code the first one comes right but after that all are wrong values
	// vo res wala point nai samjha,which makes it working
			//in sess 16 on 40 min, he told ans but gone over my head
	// the right code will have advanced version of improvising, baadme genie will cover it
	
}
}
*/

package array_questions;

import java.util.Scanner;

public class Product_except_self {
public static void main(String[] args) {
	//array input taken
	int nums[]=new int[6];
	int i=0;
	int res[]=new int[nums.length];
	System.out.println("enter an array");
	Scanner sc= new Scanner(System.in);
	for(i=0;i<nums.length;i++) {
		
	nums[i]=sc.nextInt();
	
	}
	int arr2[]=new int[6];
	int val=0;
	int j=0;
	for(i=0;i<nums.length;i++) {
       int prod=1;
		for(j=0;j<nums.length;j++) {
			if(i==j) {
				continue;
			}
			prod*=nums[j];
		
		}
		res[i]=prod;

		System.out.println(prod);	
	}
	//this upper code is written by me but there one prob so solution in below code
	//above only first value was coming right
	//so here actually just took int res and stored final ans in it and it worked
	 //btw this is half done as o(n^2),to make it o(n), use suffix prefix
	


}
}

