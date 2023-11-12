package cwh_15_str_Pract_set3;

import java.util.Scanner;


public class Exercise1 {
	public static void main(String[] args) {
		//prob 1
		String name="Saket Patil";
		name=name.toLowerCase();
		System.out.println(name);
		//prob 2
		String text="Jaydeep Unadkat";
		text=text.replace(' ','_');
		System.out.println(text);
		//prob 3
		String letter="Dear <|name|>, Thanks a lot!";
		letter=letter.replace("<|name|>", "Sachin");
		 System.out.println(letter);
		 //prob 4
		 String myString="This string contains  double and   triple spaces";
		 System.out.println(myString.indexOf("  "));
		 System.out.println(myString.indexOf("   "));
		 //prob 5
		 
	}
	

}
