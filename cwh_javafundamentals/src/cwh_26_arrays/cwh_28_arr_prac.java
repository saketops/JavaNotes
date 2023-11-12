package cwh_26_arrays;

import java.util.Scanner;

public class cwh_28_arr_prac {
	public static void main(String[] args) {
		//prob 1
		/*float array[]=new float[5];
		int c=0;
		int sum=0;
		for( c=0;c<4;c++) {
			Scanner sc=new Scanner(System.in);
			float j=sc.nextFloat();
			 array[c]=j;
			  sum+=array[c];
	}
		System.out.println(sum);*/
	//prob 2
		/*Scanner sc=new Scanner(System.in);
	
		 int  arr[]=new int[5];
		int i=0;
		
		for(i=0;i<4;i++) {
			arr[i]=sc.nextInt();
		}
		int input2=sc.nextInt();	
		for(i=0;i<4;i++) {
		if (arr[i]==input2) {
			
			System.out.println("mil gayo");
		}
		else {
			continue;
		}
		}*/
		
		
		
		//prob 3
		/*int sum=0;
		int avg=0;
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[3];
		System.out.println("enter marks1,2,3 :");
		for(int i=0;i<3;i++) {
			marks[i]=sc.nextInt();//array input			
		}
		for(int num:marks) {//for each gives every element
			 sum+=num;
			  avg=sum/3;
			
		}
		System.out.println(avg);
		*/
		//prob 4
		/*
		int[][]mat1= {{1,2,3},
				      {4,5,6}};

		int[][]mat2= {{2,6,13},
				      {3,7,1}};

		int[][]result= {{0,0,0},
				       {0,0,0}};
		for(int i=0;i<mat1.length;i++) {//row no of times
			for(int j=0;j<mat2[i].length;j++) {
				System.out.format("setting value for i=%d and j=%d,\n",i,j);
				result[i][j]=mat1[i][j]+mat2[i][j];			}
		}*/
		//prob 5
		/*solved but inefficient down efficient one
		int max=0;
		int arr[]= {1,3,4,7,5,8,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[i];//proper swapping
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				}
			
		}

		max=arr[0];// The maximum value is now at the first position after sorting
		System.out.println(max);
		
		prob5 harry
		int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

		prob 8 
		sorted or not
		boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}
		*/
		
		
	
		
		
		
		
		
		
		
		
		
		
	}	
		}
		



