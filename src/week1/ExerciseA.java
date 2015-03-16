package week1;

/**
 * Compares strings lengths.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class ExerciseA {
	public static void main(String[] args) {
		String[] array1 = { "A", "Zurich", "Abba", "long_thing_with_a_$",
				"King's College" };

		String[] array2 = { "9", "acapulco", "ABBA", "long_thing_with_a_&",
				"King Long" };

		int i = 0;
		while (i <= array1.length - 1) {
			System.out.print(array1[i].length() + " < " + array2[i].length());
			System.out.print("  " + (array1[i].length() < array2[i].length()));
			System.out.println();
			i++;
		}
	}
}
