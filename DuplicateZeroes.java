package JavaPractice;

/**
 * Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4] Explanation: After
 * calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * 
 * @author u0982683
 *
 */
public class DuplicateZeroes {

	static int[] numsSquared;

	public void duplicateZeros(int[] arr) {
		int length = arr.length;
		for (int i = length - 1; i >= 0; i--) {
			if (arr[i] == 0 && i != length - 1) {
				for (int j = length - 1; j > i; j--) {
					if (j < length - 1)
						arr[j + 1] = arr[j];

				}
				arr[i + 1] = 0;
			}
		}

	}
}
