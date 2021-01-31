import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 
 * @author lee-annmokoena
 *
 */

public class NthSmallest {

	public static void main(String[] args) {
		
		System.out.println("--Enter a value n (e.g 5) to print the nth smallest number from a list of random numbers-- ");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println("Smallest Number is: " + nthSmallest(number));
		
		sc.close();

	}
	
	public static int nthSmallest(int number) {
		
		
		Random random =  new Random();
		
		
		int[] number_collection = new int[500];
		
		if(number > number_collection.length -1) {
			System.out.println("INVALID ENTRY.Ensure Number is between 0 & 499" + "\n");
			return -1;
		}
		
	
		for(int index = 0; index < number_collection.length; index++) {
			
			number_collection[index] = random.nextInt(500);
			
		}
		
		Arrays.sort(number_collection);
		
		/* verify that numbers printed are random and sorted
		System.out.println("sorted array " + Arrays.toString(number_collection));
		
		*/
		return number_collection[number];
	}

}
