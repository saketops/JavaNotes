package array_questions;

public class Segre_0sand1s {
	public static void main(String[] args) {
		int arr[]= {0,0,1,0,1,1,0,1};
		/*int i=0;
		int j=arr.length-1;
		int temp=0;
		while(i<=j) {
			if(arr[i]==0) {
				i++;
				
			}
			else if(arr[j]==1){
				j--;
				
			}
			else{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				
			}
		
		}
			for(i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
			
		
		
	
	
	
	
	*/
		//by sorting
		int temp=0;
		int i=0;
		
		for( i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<8;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

}


