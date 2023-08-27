package Chureka;

import java.util.Scanner;

public class clanader {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the month of a year");
		int Month=s.nextInt();
				switch (Month) {
				case 1:
				System.out.println("junuary");
				System.out.println("31");
				break;
				case 2:
				    System.out.println("february");
				    System.out.println("28");
				    break;
				  case 3:
				    System.out.println("march");
				    System.out.println("31");
				    break;
				  case 4:
					  System.out.println("April");
					    System.out.println("30");
				    break;
				  case 5:
					  System.out.println("may");
					    System.out.println("31");
				    break;
				  case 6:
					  System.out.println("june");
					    System.out.println("30");
				    break;
				  case 7:
					  System.out.println("july");
					    System.out.println("31");
				    break;
				  case 8:
					  System.out.println("August");
					    System.out.println("31");
				    break;
				  case 9:
					  System.out.println("september");
					    System.out.println("30");
				    break;
				  case 10:
					  System.out.println("october");
					    System.out.println("31");
				    break;
				  case 11:
					  System.out.println("november");
					    System.out.println("30");
				    break;
				  case 12:
					  System.out.println("december");
					    System.out.println("31");
				    break;
				   
				    default:
					 System.out.println("invaild Month ");
					 
	}

}
}
