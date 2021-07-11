package com.bridgelabz.Utility;
import java.util.Scanner;

public class Utility {
// Day of the week
		public static int dayOfWeek(int month, int date, int year) {
			// System.out.println("Entered date is : " + month + "/" + date + "/" +
			// year);
			int y0 = year - (14 - month) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = month + 12 * ((14 - month) / 12) - 2;
			int d0 = (date + x + 31 * m0 / 12) % 7;
			return d0;
		}
//Temperature Convert
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
		
//Monthly Payment		
		public static void monthlyPayment(int principalLoan, int years, double rateOfInterest) {

			int n = 12 * years;
			double result = rateOfInterest / (12 * 100);
			double payment = (principalLoan * result) / (1 - Math.pow(1 + result, (-n)));

			System.out.println("The output is...." + payment);
		}
//Square Root
		public static void sqrt(int c) {
			double t = c;
			double epsilon = 1e-15;
			while (Math.abs(t - c / t) > (epsilon * t)) {
				t = (c / t + t) / 2.0;

			}
			System.out.println("The Result is.." + t);
		}
//To Binary
		public static String toBinary(int decimal) {
			String binary = "";
			while (decimal > 0) {
				binary = decimal % 2 + binary;
				decimal = decimal / 2;
				System.out.print(binary);
			}
			return binary;
		}
//Binary
		public static double toDecimal(char[] array, double sum) {
			int temp = 0;
			String powerTwo = "";
			// System.out.println("" +array.length);
			for (int i = array.length - 1; i >= 0; i--) {
				if (array[i] == '1') {
					sum = sum + (Math.pow(2, temp));
					if (temp < array.length - 1)
						powerTwo = powerTwo + (Math.pow(2, temp)) + "+";
					else
						powerTwo = powerTwo + (Math.pow(2, temp)) + "=";
				}
				temp++;
			}
			System.out.print(powerTwo);
			System.out.println(sum);
			return sum;
		}
//Power of Two
		public static boolean isPowerOfTWo(int result) {
			return result != 0 && ((result & (result - 1)) == 0);
		}
		
		static Scanner scanner = new Scanner(System.in);
		public static int getInteger() {
			return scanner.nextInt();

}
}