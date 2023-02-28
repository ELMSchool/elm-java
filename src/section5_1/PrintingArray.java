package section5_1;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingArray {

	public static void main(String[] args) {

		String name = "John";

//		System.out.println(name);

		String[] names = { "John", "Fred", "Jane" };

		int[] numbers = { 1, 3, 5, -2 };
//		printArray(names);
		
		String str = Arrays.toString(names);
		System.out.println(str);
		System.out.println(Arrays.toString(numbers));

	}

	public static void printArray(String[] strArray) {

		for (int i = 0; i < strArray.length; i++) {

			System.out.print(strArray[i] + " ");
		}

	}

	public static void printArray(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {

			System.out.print(intArray[i] + " ");
		}

	}
}
