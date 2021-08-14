package JavaPractice;

public class RemoveElement {
	
	
//	//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//	Output: 5, nums = [0,1,4,0,3,_,_,_]
//	Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//	Note that the five elements can be returned in any order.
//			It does not matter what you leave beyond the returned k (hence they are underscores).

	public static void main(String[] args) {
		// Create a new array with a capacity of 6.
		int[] array = new int[6];

		// Current length is 0, because it has 0 elements.
		int length = 0;

		// Add 3 items into it.
		for (int i = 0; i < 3; i++) {
			array[i] = i * i;
			// Each time we add an element, the length goes up by one.
			length++;
		}

		System.out.println("The Array has a capacity of " + array.length);
		System.out.println("The Array has a length of " + length);

	}

}
