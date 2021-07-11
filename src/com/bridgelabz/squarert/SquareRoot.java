package com.bridgelabz.squarert;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int c=scanner.nextInt();
		Utility.sqrt(c);
		scanner.close();
	}

}
