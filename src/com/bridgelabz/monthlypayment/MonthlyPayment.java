package com.bridgelabz.monthlypayment;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		int principal=scanner.nextInt();
		
		System.out.println("Enter year:");
		int year=scanner.nextInt();
		
		System.out.println("Enter rate:");
		double rate=scanner.nextDouble();
		Utility.monthlyPayment(principal,year,rate);
		scanner.close();

	}

}