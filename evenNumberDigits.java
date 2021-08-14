package JavaPractice;

public class evenNumberDigits {

	public int count = 0;

//	public int findNumbers(int[] nums) {
////		for (int num : nums) {
////			if (String.valueOf(num).length() % 2 == 0) {
////				count = count + 1;
////			}
////		}
////		return count;
//
//		for (int num : nums) {
//			while (num != 0) {
//				num = num % 10;
//				count++;
//			}
//		}
//		return count;
//
//	}

	/**
	 * nums = [12,345,2,6,7896]
	 * 
	 * int count = 0;
	 * 
	 * 7896 / 10 until the remainder is 0 Keep increasing the count as the divison
	 * goes on, once it's done you'll get what the number of digits reflected in the
	 * count. At which point you can sdee if it's divisible by 2 and if it is, it's
	 * even.
	 *
	 * 7896 / 10 = 789 count = 1 789/10 = 78 count = 2 78/10 = 7 count = 3 7/10 = 0
	 * count = 4
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public int findDigit(int num) {
		num = Math.abs(num);
		
		if(num == 0) {
			return 1;
		}

		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		evenNumberDigits number = new evenNumberDigits();

		int nums = 1;
		System.out.println(number.findDigit(nums) + " digits ");
		int a = 6 / 10;
		System.out.println(a);

	}

}
