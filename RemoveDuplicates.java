package JavaPractice;

/**
 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_] Explanation: Your function
 * should return k = 2, with the first two elements of nums being 1 and 2
 * respectively. It does not matter what you leave beyond the returned k (hence
 * they are underscores).
 * 
 * @author u0982683
 *
 */
public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		int index = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[index++] = nums[i + 1];
			}
		}
		return index;
	}
}
