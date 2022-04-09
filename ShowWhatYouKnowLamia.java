/**
 * Calculates the average for 10 grades inputed
 * 
 * date         20210408
 * @filename    ShowWhatYouKnowLamia.java
 * @author      LAMIA
 */

import java.util.Scanner; 
public class ShowWhatYouKnowLamia {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		// Variables
		int[] grades = new int [10]; 
		int sumOfAllMarks = 0;
		int avg = 0; 
		final double percentage = 100; 
		Boolean whileCntrl = true; 
		
		while (whileCntrl) {
		
		System.out.println("------ CALCULATE YOUR AVERAGE! ------");
		System.out.println("");
		System.out.println("Enter in 10 grades you have received and calculate your average.");
		System.out.println("Make sure to round your number (e.g 99, 45, etc.). Do not include decimal numbers (e.g 55.6, etc.)");
		System.out.println("");
		
		for (int f = 0; f <= 9; f = f + 1) {
			
			grades [f] = keyboard.nextInt(); 
		}
		
		for (int f = 0; f <= 9; f = f + 1)  {
	       
			sumOfAllMarks = sumOfAllMarks + (grades[f]);
			
	    }
	
		avg = sumOfAllMarks/10;
		
		System.out.println("");
		System.out.println("Your average is: " + avg + "%");
		System.out.println("");
		}
	}
}
