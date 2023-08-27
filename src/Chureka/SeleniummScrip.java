package Chureka;

import java.util.Scanner;

public class SeleniummScrip {
	
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("inter the year");
		int a=s.nextInt();
		if(a%4==0||a%400==0) {
			
			System.out.println("your are Enter leap year");
			
		}
		else {
			System.out.println("your are Enter not leap year");
		}
	}

}
