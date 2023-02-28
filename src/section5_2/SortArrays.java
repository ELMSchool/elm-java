package section5_2;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {

		

		int[] nums = { 4, 12, 3, 61, 17, -9 }; // 61 - (-9) = 61 + 9 = 70
//		System.out.println(findTheDifference(nums));
		
		
		System.out.println(Arrays.toString(nums));
		//Arrays.sort() - sorts given array in ascending order (from smaller to bigger)
		Arrays.sort(nums); 
		System.out.println(Arrays.toString(nums));
		int diff = nums[nums.length-1] - nums[0];
		System.out.println(diff);

	}
	
	
	// There is a given int array find difference between largest and smallest
			// element
	public static int findTheDifference(int[] nums) {
// 4, 12, 3, 61, 17, -9 }
		int largest = nums[0];   //4
		int smallest = nums[0];	 //4
		int idx = 0;
		
		while (idx < nums.length) {
			//-9				61
			if (nums[idx] > largest) {
				
				largest = nums [idx];
			}
			//-9				-9
			if (nums[idx] < smallest) {
				
				smallest = nums[idx];
			}
			
			idx++;
			
		}
				//61  - (-9) = 70
		return largest - smallest;
	}

}
