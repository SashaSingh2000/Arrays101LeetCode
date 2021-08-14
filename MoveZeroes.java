package JavaPractice;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * @author u0982683
 *
 */
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		int length = nums.length;
		int count = 0;

		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}

		}
		while (count < length) {
			nums[count++] = 0;
		}
	}
}
