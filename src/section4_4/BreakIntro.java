package section4_4;

import java.util.Scanner;

public class BreakIntro {

	public static void main(String[] args) {

		/*
		 * Write a program which calculates the memory of camera After each picture it
		 * subtracts picture memory from SD memory Once we reach at the limit (128 mb)
		 * It gives message that you are out of memory, you can't take more pictures
		 * At the end print out how many pictures we took
		 */
		Scanner scan = new Scanner(System.in);
		
		double sdMemory = 128;
		int picturesCount = 0;
		while (sdMemory > 0) {
			
			System.out.println("Taking a picture...");
			double pictureSize = scan.nextDouble();
			
			sdMemory -=pictureSize;
			
			if (sdMemory <= 0) {
				
				System.err.println("You are out of memory!");
				break;
			}
			
			picturesCount++;
			
		}
		
		System.out.println("We took " + picturesCount + " pictures in total");

	}

}
