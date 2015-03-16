package week1;

/**
 * Tests weather combined income is subject to higher tax rate.
 * @author Vladimirs Ivanovs
 *
 */
public class ExerciseB {

	public static void main(String[] args) {
		int tax = 40000;
		int salary1 = 15000;	//change to test
		int salary2 = 25000; 	//change to test
		if ((salary1+salary2)<tax){
			System.out.println("Pay tax at lower rate.");
		}else{
			System.out.println("Pay tax at higher rate.");
		}

	}

}
