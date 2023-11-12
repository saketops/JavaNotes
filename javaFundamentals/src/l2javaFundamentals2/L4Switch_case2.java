package l2javaFundamentals2;

import java.util.Scanner;

// take no. from user and give its roman value
public class L4Switch_case2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x = scanner.nextInt();
		String result=null;
		if(x>10) {
			System.out.println("not valid");
		}
		else {
		switch(x)
		{
		case 1:
			result="|";
			break;
		case 2:
			result="||";
		break;
		case 3:
			result="|||";
		break;
		case 4:
			result="|V";
		break;
		case 5:
			result="V";
		break;
		case 6:
			result="V|";
		break;
		case 7:
			result="V||";
		break;
		case 8:
			result="V|||";
		break;
		case 9:
			result="|X";
		break;
		case 10:
			result="X";
		break;
		default:
			result="invalid";

		}

		System.out.println("result:"+result);
	}}

}
