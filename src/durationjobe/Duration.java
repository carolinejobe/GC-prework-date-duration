package durationjobe;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Duration {
	public static void main(String[] args) {

		System.out.print("Enter a date (MM/DD/YYYY): ");

		Scanner s = new Scanner(System.in);
		String start = s.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		System.out.print("Enter a second date (MM/DD/YYYY): ");

		String finish = s.next();


		LocalDate begin = LocalDate.parse(start, formatter);
		LocalDate end = LocalDate.parse(finish, formatter);

		Period p = Period.between(begin, end);
		int years = p.getYears();
		int months = p.getMonths();
		int days = p.getDays();
		
		System.out.print("The duration between these dates is ");
		
		if (years == 1) {
			System.out.print(years + " year, ");
		}
		else if (years > 1 || years < 0) {
			System.out.print(years + " years, ");
		}
		if (months == 1) {
			System.out.print(months + " month, ");
		}
		else if (months > 1 || months < 0) {
			System.out.print(months + " months, ");
		}
		if (days == 1) {
			System.out.print(days + " day.");
		}
		else if (days > 1 || days < 0) {
			System.out.print(days + " days.");
		}
		s.close();
	}

}
