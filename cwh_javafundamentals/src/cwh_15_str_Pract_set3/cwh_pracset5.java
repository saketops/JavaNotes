package cwh_15_str_Pract_set3;

public class cwh_pracset5 {
	public static void main(String[] args) {
		//practice prob 1
		/*int n=4;
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
			System.out.print("*");
		}

			System.out.println("\n");
			}*/
		//practice prob2
		/*int n=6;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=2*i;
			
		}System.out.println(sum);
		
		*/
		//prob 3
		/*
		int n=5;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n", n,i,n*i);
		}*/
		//prob 4
		/*int n=10;
		for(int i=10;i>0;i--) {
			System.out.printf("%d x%d = %d\n",n,i,n*i);
		}*/
		//prob 5
		/*int n=3;
		int fact=1;
		for(int i=n;i>0;i--) {
			fact*=i;
		}
		System.out.println(fact);
		
		*/
		//prob 6
		/*int n=3;
		int i=n;
		int fact=1;
		while(i>0) {
			fact*=i;
			i--;
			
		}
		System.out.println(fact);
		*/
		//prob 7
		/*int n=4;
		int i=n;
		int j=0;
		while(i>0) {
			while(j<i) {
			System.out.println("*");
			j++;
			i--;}
			
		}
		try to solve
		//repeat 2 using for
		*/
		//prob 8
		int n=8;
		int sum=0;
		for(int i=1;i<11;i++) {
			 sum+=n*i;
			
		}
		System.out.println(sum);
		
		
	}
}
