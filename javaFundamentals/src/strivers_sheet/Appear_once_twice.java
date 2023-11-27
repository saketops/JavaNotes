package strivers_sheet;

public class Appear_once_twice {
	public static void main(String[] args) {
		int arr[]= {2,0,2,1,1,3,3};
		int i=0;
		int j=0;
		for(i=0;i<7;i++) {
			for(j=1;j<7;j++) {
				if(i==j) {
					break;
				}
				
			}
			if(i!=j) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
