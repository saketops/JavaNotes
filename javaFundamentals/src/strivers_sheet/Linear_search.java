package strivers_sheet;

import java.util.Scanner;

public class Linear_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k,num=0;
		k=sc.nextInt();
		num=sc.nextInt();
		int i;
		int arr[]=new int[k];
		for(i=0;i<k;i++) {
		arr[i]=sc.nextInt();
		}
		for(i=0;i<k;i++) {
			if(num==arr[i]) {
				System.out.println(i);
			}
		}
		
		
	}

}
