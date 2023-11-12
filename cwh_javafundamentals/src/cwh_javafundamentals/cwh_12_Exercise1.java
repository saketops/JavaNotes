package cwh_javafundamentals;
import java.util.*;

public class cwh_12_Exercise1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of sub1");
		int a=sc.nextInt();
		System.out.println("enter marks of sub2");
		int b=sc.nextInt();
		System.out.println("enter marks of sub3");
		int c=sc.nextInt();
		System.out.println("enter marks of sub4");
		int d=sc.nextInt();
		System.out.println("enter marks of sub5");
		int e=sc.nextInt();
		int percent=(a+b+c+d+e)*100/500;
		System.out.println(percent);

	}

}
