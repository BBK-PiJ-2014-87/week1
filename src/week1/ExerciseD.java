package week1;

import java.util.Scanner;

/**
 * Takes to numbers and checks if first number can be 
 * divided by second number without a reminder.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class ExerciseD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first number.");
		int numerator = in.nextInt();
		System.out.println("Please enter second number.");
		int denom = in.nextInt();
		if(denom == 0){
			System.out.println("Can't devide by 0.");
		}else if(numerator%denom == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}
