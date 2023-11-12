package cwh_15_str_Pract_set3;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class stone_paper_scissor {
	public static void main(String[] args) {
		Random rn =new Random();
		int num;
		for(int counter=1;counter<=10;counter++) {
			num=1+rn.nextInt(3);
			
		
		Scanner sc=new Scanner(System.in);
		int usernum=sc.nextInt();		
		
		if(num==0&& usernum==1) {
			System.out.println("u win");
		}
		if(num==0&& usernum==2) {
			System.out.println("u lose");
		}
		if(num==0&& usernum==0) {
			System.out.println("tie");
		}
		
		
		
		
		}
	}

}
