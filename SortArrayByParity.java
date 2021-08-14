package JavaPractice;

/**
 * Given an integer array nums, move all the even integers at the beginning of
 * the array followed by all the odd integers.
 * 
 * Return any array that satisfies this condition.
 * 
 * @author u0982683
 *
 */
public class SortArrayByParity {
	public int[] sortArrayByParity(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				int temp = nums[index];
				nums[index++] = nums[i];
				nums[i] = temp;
			}
		}
		return nums;
	}
}
