/*5.f.Write a program that defines an enum having months of the year and then
prints the value of all the enum elements.*/

package com.wbl.collections;
import java.time.Month;

public enum FiveF {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

	public static void main(String[] args) {
		Month[] month = Month.values();

		for (Month months : month) {
			System.out.println(months);
		}
		
	}
}
