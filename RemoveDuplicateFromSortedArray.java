package JavaPractice;

/**
 * Input: arr = [10,2,5,3] Output: true Explanation: N = 10 is the double of M =
 * 5,that is, 10 = 2 * 5.
 * 
 * @author u0982683
 *
 */
public class RemoveDuplicateFromSortedArray {

	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] * 2 == arr[j])
					return true;
			}
		}
		return false;
	}
}
