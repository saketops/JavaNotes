package array_questions;

import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		//my approach
		//given an array nums, take an inp target,return indices of numbers that add up to target
		//first i'll take an array input
		Scanner sc=new Scanner(System.in);
				int nums[]= new int[8];
		System.out.println("enter array ");
		int i=0;
		int j=0;
		
		
		for(i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("enter input");
		int target=sc.nextInt();
		for(i=0;i<nums.length;i++) {
			for(j=0;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					
					
				
					System.out.println(i);
					System.out.println(j);
					
					break;
					
				}

				else {
					//System.out.println("no such number possible");
				continue;
					
			
				}
			}
		}
			//also use method here,after harry video ,or refer genie section here
		//genie- if want ans in pairs,int res[]=new int[2]
		//and res[0]=i,res[1]=j
		//well my code works but the same prob of recurring else statements
		//solution- using boolean
		// and other thing is complexity is O(n^2) so reduce it
		//this is homework
		
		
	
	
	
	}
}
