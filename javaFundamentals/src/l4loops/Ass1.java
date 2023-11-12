package l4loops;
//write  a java method to calculate factorial, a  given non negative integer using for loop
public class Ass1 {
	public static void main(String[] args) {
		int n=20;
		long facto=1;//initialise to 1

		for(int i=1;i<=n;i++) {//change loop  condition
			
			 facto*=i;//cal factorial
		}
		System.out.println(facto);

	}



}
