package strivers_sheet;

public class rotate_left_arr_by_one {
public static void main(String[] args) {
	//my logic
	/*
	int arr[]= {1,2,3,4,5};
	int n= arr.length-1;
	int i=0;
	int temp=0;
	for(i=0;i<n;i++) {
		if(i==0) {
			temp=arr[n];
			arr[n]=arr[i];			
		}
		if(i>0&&i<n) {
			temp=arr[i];
			arr[i]=arr[i+1];
			
		}
	}
	for(i=0;i<n;i++) {
		System.out.println(arr[i]);
	}*/
	//gpt logic
	/*int arr[] = {1, 2, 3, 4, 5};
    int n = arr.length;
    int temp = arr[0];
    
    for (int i = 0; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }
    
    arr[n - 1] = temp;

    for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
    }*/
	//try by myself now
}
}
