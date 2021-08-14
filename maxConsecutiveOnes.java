package JavaPractice;

/**
 * Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or
 * the last three digits are consecutive 1s. The maximum number of consecutive
 * 1s is 3.
 * 
 * @author u0982683
 *
 */
public class maxConsecutiveOnes {

	public int count = 0;
	public int max = 0;

	public int findMaxConsecutiveOnes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count = count + 1;
				max = Math.max(count, max);
			} else {
				count = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
