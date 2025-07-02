package com.String;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String name=sc.nextLine();
		
		char reverse;
		System.out.print("reverse String:");
		for(int i=name.length()-1;i>=0;i--) {
			 reverse = name.charAt(i);
		System.out.print(reverse);
		}

		sc.close();
	}

}
