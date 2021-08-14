package JavaPractice;

public class squaresOfASortedArray {

	static int[] numsSquared;

	/**
	 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After
	 * squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
	 * [0,1,9,16,100].
	 * 
	 * @param nums
	 * @return
	 */
	public static int[] sortedSquares(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			numsSquared[i] += nums[i] * 2;
		}
		return numsSquared;

	}

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		sortedSquares(nums);

	}

}
