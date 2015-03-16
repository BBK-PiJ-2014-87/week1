package week1;

import java.util.Scanner;

/**
 * Counts entered numbers.
 * @author Vladimirs Ivanovs
 *
 */
public class ExerciseC2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		do {
			System.out.println("Please enter a number. Enter 0 to exit.");
			int number = in.nextInt();
			if (number == 0)
				break;
			count++;
		} while (true);

		System.out.println("You entered " + count + " numbers.");
	}
}
