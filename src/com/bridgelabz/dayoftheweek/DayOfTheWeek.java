package com.bridgelabz.dayoftheweek;

import java.util.Scanner;
import com.bridgelabz.Utility.Utility;

public class DayOfTheWeek {

	public static void main(String[] args) {
		String array[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month:");
		int month=scanner.nextInt();
		System.out.println("Enter date");
		int date=scanner.nextInt();
		System.out.println("Enter year");
		int year=scanner.nextInt();
		int result = Utility.dayOfWeek(month,date,year);
		System.out.println(array[result]);
		scanner.close();	
	}
}