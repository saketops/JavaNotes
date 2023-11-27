package strivers_sheet;

public class Move_zeros_to_end {
	public static void main(String[] args) {
		int arr[]= {1,2,0,0,3,4};
		int i=0;
		int j=0;
		int temp=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				}
				
			}
		for(j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}

		
		
		}
		
		
		
		
		
	}


