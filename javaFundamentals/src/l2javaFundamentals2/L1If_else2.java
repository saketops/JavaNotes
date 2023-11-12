package l2javaFundamentals2;

public class L1If_else2 {
	public static void main(String[] args) {
		/*int a=30;
		if(a%3==0) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}*/


		//nested if- ek ke andar ek
		int a=1000;
		if(a==10) {
		System.out.println("same");
		if(a>100) {
			System.out.println("less than 100");}}

		if(a%2==0) {
			System.out.println("even");
		}
		if(a>10) {
			System.out.println("no");
		}
		else {
			System.out.println("yes a is greater than 100");
		}
		// if else goes in pairs, else is in pair with the last if
	}

}
