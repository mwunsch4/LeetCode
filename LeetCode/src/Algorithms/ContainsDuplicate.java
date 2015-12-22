package Algorithms;

import java.util.HashMap;
import java.util.Random;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> charMap = new HashMap<Integer, Integer>();
        
        for(int c = 0; c < nums.length; c++) {
            if (charMap.get(nums[c]) == null) {
                charMap.put(nums[c], 1);
            } else {
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Random r = new Random();
		int[] numbers = new int[10];
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = r.nextInt(25);
	      System.out.println(numbers[i]);
	    }
	    System.out.println(containsDuplicate(numbers));

	}

}
