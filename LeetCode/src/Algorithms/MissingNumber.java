package Algorithms;

import java.util.Random;

public class MissingNumber {
	
	public static int missingNumber(int[] nums) {
        int[] foundNums = new int[nums.length + 1];
        for (int c = 0; c < nums.length; c++) {
            foundNums[nums[c]] = 1;
        }
        for (int d = 0; d < foundNums.length; d++) {
            if (foundNums[d] == 0) {
                return d;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		Random r = new Random();
		int range = 100;
		int[] numbers = new int[range];
		int skip = Math.abs(r.nextInt(range - 1));
		for (int c = 0; c < range-1; c++) {
			if (c != skip) {
				numbers[c] = c; 
			} 
		}
		System.out.println("Skip: " + skip);
		System.out.println("Missing: " + missingNumber(numbers));

	}

}
