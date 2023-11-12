package cwh_javafundamentals;

import java.util.Scanner;

public class cwh_16_if_else {
	public static void main(String[] args) {
		int age;
		System.out.println("enter age:");
		Scanner sc= new Scanner(System.in);
		age=sc.nextInt();
		switch(age) {
		case 18:
			System.out.println("yea");
			break;
		case 34:
			System.out.println("woah");
			break;
			default:
				System.out.println("enjoy life");
				
		}
	}

}
