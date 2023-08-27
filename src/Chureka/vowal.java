package Chureka;

import java.util.Scanner;

public class vowal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Alphabet---->");
	char a=s.next().charAt(0);	
		if (a=='a'|| a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.println("this is vowal");
			
		}
		else if(a=='A'|| a=='E'||a=='I'||a=='O'||a=='U') {
			System.out.println("its  is vowal as capital");
			
		}
		else 
		{
			System.out.println("this is consonent");
		}
	}

}
