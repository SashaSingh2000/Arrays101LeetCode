package JavaPractice;

import java.util.Arrays;

/**
 * Input: heights = [1,1,4,2,1,3] Output: 3 Explanation: heights: [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4] Indices 2, 4, and 5 do not match.
 * 
 * @author u0982683
 *
 */
public class HeightChecker {

	public int heightChecker(int[] heights) {

		int count = 0;
		int[] arr = heights.clone();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != heights[i])
				count++;

		}
		return count;
	}

}
