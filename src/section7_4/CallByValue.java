package section7_4;
import java.util.*;
public class CallByValue {
	
	
	public static void main(String[] args) {
		
		
		int a = 1;
		System.out.println("Value of a before the call: "+a); //1
		add100(a);
		System.out.println("Value of a after the call: " +a);
		System.out.println();
		
		
		int arr [] = {1, 2, 3};
		System.out.println("Value of arr before the call: "+Arrays.toString(arr)); //1
		add100(arr);
		System.out.println("Value of a after the call: " +Arrays.toString(arr));
	}
	
	public static void add100(int [] array) {
		
		for (int i =0; i< array.length; i++) {
			
			array [i] +=100;
		}
		System.out.println(Arrays.toString(array));
	}
	
	
	
	public static void add100(int a){
		
		
		a = a+100;
		System.out.println(a);
		
	}

}
