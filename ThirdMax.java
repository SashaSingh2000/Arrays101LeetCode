package JavaPractice;

/**
 * Given integer array nums, return the third maximum number in this array. If
 * the third maximum does not exist, return the maximum number.
 * 
 * Input: nums = [2,2,3,1] Output: 1 Explanation: Note that the third maximum
 * here means the third maximum distinct number. Both numbers with value 2 are
 * both considered as second maximum.
 * 
 * @author u0982683
 *
 */
public class ThirdMax {
	public int thirdMax(int[] nums) {
		Integer max = null;
		Integer secondMax = null;
		Integer thirdMax = null;

		for (Integer num : nums) {
			if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
				continue;
			}

			if (max == null || num > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = num;
			} else if (secondMax == null || num > secondMax) {
				thirdMax = secondMax;
				secondMax = num;

			} else if (thirdMax == null || num > thirdMax) {
				thirdMax = num;
			}

		}
		if (thirdMax == null) {
			return max;
		}
		return thirdMax;

	}
}
