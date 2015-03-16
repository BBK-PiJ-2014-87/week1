package week1;

/**
 * Calculates squares and square roots of numbers from 1 to 10.
 * @author Vladimirs Ivanovs
 *
 */
public class ExerciseA2 {

	public static void main(String[] args) {
		int i = 1;
		while (i<11){
			System.out.println(i+"^2 = "+i*i);
			System.out.println("Square root of "+i+" is: "+ Math.sqrt(i*1.0));
			i++;
		}

	}

}
