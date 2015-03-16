package week1;

/**
 * IF-THEN-ELSE practice 
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class ExcerciseC {

	public static void main(String[] args) {
		int examMark = 69; 		//change to test
		
		if (examMark >= 70){
			System.out.println("Great result!");
		}else if(examMark >= 50){
			System.out.println("A satisfactory result.");
		}else{
			System.out.println("I'm afraid you have failed!");
			System.out.println("You may re-enter next year.");
		}

	}

}
