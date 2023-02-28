package section5_2;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = { 4, 12, 3, 61, 17, -9 };
		Arrays.sort(nums);
		System.out.println(Arrays.binarySearch(nums, 6));
//		System.out.println(Arrays.toString(nums));
		//{ -9, 3, 12, 61, 17, 4 }
		for (int i = 0; i < nums.length; i++) {
			
			for (int k = i + 1; k < nums.length; k++) {
					//4		  3
				if (nums[i] > nums[k]) {
						//4
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
				}

			}

		}

		System.out.println(Arrays.toString(nums));

	}

}
