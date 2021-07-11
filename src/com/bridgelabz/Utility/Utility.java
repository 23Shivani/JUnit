package com.bridgelabz.Utility;

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
	}