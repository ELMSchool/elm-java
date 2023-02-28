package section5_1;

public class AccessArrayElements {
	
	
	public static void main(String[] args) {
		
		
		int[] numbers = {1, 5, 90, -25};
		
		numbers[0] = 10;
		numbers[1]++;
		numbers[3] +=25;
		
//		for (int i = 0; i<numbers.length; i++) {
//			
//			System.out.println(numbers[i]);
//			
//		}
		
		
		int values[] = new int [3]; //{0,70,-5}
		values[1] = 70;
		values[2] = -5;
		
		for (int k = 0; k<values.length; k++) {
			
//			System.out.println(values[k]);
		}
		
//		double [] sample = new double [8];
//		
//		for (int i = 0; i<sample.length; i++) {
//			System.out.println(sample[i]);
//		}
	}

}
