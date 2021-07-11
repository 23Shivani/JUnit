package com.bridgelabz.Utility;
import java.util.Queue;
import java.util.Scanner;

public class Utility {

		public static int dayOfWeek(int month, int date, int year) {
			// System.out.println("Entered date is : " + month + "/" + date + "/" +
			// year);
			int y0 = year - (14 - month) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = month + 12 * ((14 - month) / 12) - 2;
			int d0 = (date + x + 31 * m0 / 12) % 7;
			return d0;
		}
	
		public static void temperatureConversion() {
			// TODO Auto-generated method stub
			System.out.println("\nEnter 1 for Fahrenheit to Celsius" + "\nEnter 2 for Celsius to Fahrenheit"
					+ "\nSomething else to Exit." + "\nYour Option:");
			Scanner scanner = new Scanner(System.in);
			int selection = scanner.nextInt();
			if (selection == 1) {
				System.out.println("Enter a degree in Fahrenheit:");
				fahrenheitToCelsius();
			} else if (selection == 2) {
				System.out.println("Enter a degree in Celsius:");
				celsiusToFahrenheit();
			} else {
				System.out.println("Invalid");
			}
			scanner.close();
		}
		private static void celsiusToFahrenheit() {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			Double celsius = scanner.nextDouble();
			System.out.println(celsius + " celsius is " + ((celsius * 9 / 5.0) + 32) + " Fahrenheit");
			temperatureConversion();
			scanner.close();
			}
		private static void fahrenheitToCelsius() {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			Double Fahrenheit = scanner.nextDouble();
			System.out.println(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0)) + " celsius");
			temperatureConversion();
			scanner.close();
			}
}