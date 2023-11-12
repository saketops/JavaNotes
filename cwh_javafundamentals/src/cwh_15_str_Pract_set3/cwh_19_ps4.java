package cwh_15_str_Pract_set3;

import java.util.Scanner;

public class cwh_19_ps4 {
public static void main(String[] args) {
	//prob1
	Scanner sc =new Scanner(System.in);
	int sub1=sc.nextInt();
	int sub2=sc.nextInt();
	int sub3=sc.nextInt();
	int sub1percent=sub1/300*100;
	int sub2percent=sub2/300*100;
	int sub3percent=sub3/300*100;
	int total=(sub1percent+sub2percent+sub3percent)/3;
	if(total>=40) {
		if(sub1percent>=33 && sub2percent>=33 && sub3percent>=33) {
			System.out.println("pass bitch");
		}
	}
	else {
		System.out.println("fail");
	}
	
	//prob2
	/*
	Scanner sc=new Scanner(System.in);
	float income=sc.nextFloat();
	if(income>=2.5 && income<=5.0) {
		float tax=5*income/100;
		System.out.println(tax);
	}
	else if(income>5.0 && income<=10.0) {
		float tax=20*income/100;
		System.out.println(tax);
	}else if(income>10.0) {
		float tax=30*income/100;
		System.out.println(tax);
	}
	else {
		System.out.println("gareeb");
	}
	*/
	//prob3
	/*
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a no. :");
	int day=sc.nextInt();
	switch(day) {
	case 1:System.out.println("mon");

	break;
	case 2:System.out.println("tue");

	break;
	case 3:System.out.println("wed");

	break;
	case 4:System.out.println("thu");
	break;
	case 5:System.out.println("fri");

	break;
	case 6:System.out.println("sat");

	break;
	case 7:System.out.println("sun");

	break;
	default:System.out.println("no day day");
	}*/
	//prob4
	/*
	Scanner sc=new Scanner (System.in);
	float year=sc.nextFloat();
	if (year%4==0) {
		System.out.println("is a leap year");
	}
	else {
		System.out.println("not");
	}*/
	//prob5
	/*
	Scanner sc= new Scanner(System.in);
	String website=sc.next();
	if(website.endsWith(".com")) {
		System.out.println("is commercial");
	}
	else if(website.endsWith(".org")) {
		System.out.println("is organisation");
	}
	else if(website.endsWith(".in")) {
		System.out.println("is indian");
	}*/
	

}
}
