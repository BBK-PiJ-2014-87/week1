package week1;

import java.util.Scanner;

/**
 * Using switch statement with enums.
 * @author Vladimirs Ivanovs
 *
 */
public class ExerciseC3 {
	public static void main(String[] args) {
		System.out.println("Please enter a day.");
		Scanner in = new Scanner(System.in);
		String currentDay = in.nextLine();

		Days day = Days.valueOf(currentDay.toUpperCase()); 

		switch (day) {
		case FRIDAY:
			System.out.println("It's " + Days.FRIDAY);
			break;
		case MONDAY:
			System.out.println("It's " + Days.MONDAY);
			break;
		case SATURDAY:
			System.out.println("It's " + Days.SATURDAY);
			break;
		case SUNDAY:
			System.out.println("It's " + Days.SUNDAY);
			break;
		case THURSDAY:
			System.out.println("It's " + Days.THURSDAY);
			break;
		case TUESDAY:
			System.out.println("It's " + Days.TUESDAY);
			break;
		case WEDNESDAY:
			System.out.println("It's " + Days.WEDNESDAY);
			break;
		default:
			break;
		}
	}
}
