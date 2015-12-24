package Algorithms;
import java.util.HashMap;

//Given an array of size n, find the majority element. The majority element is the element that appears more than  floor(n/2) times
public class MajorityElement {
	public static int majorityElement(int[] nums) {
        Double target = Math.floor(nums.length/2);
        int count;
        HashMap<Integer, Integer> charCount = new HashMap<Integer, Integer>();
        for (int c = 0; c < nums.length; c++) {
            if (charCount.get(nums[c]) == null) {
                count = 0;
            } else {
                count = charCount.get(nums[c]);
            }
            count++;
            if (count > target) {
                return nums[c];
            }
            charCount.put(nums[c], count);
        }
        return 0;
    }
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[]{1,2,3,1,1,1,4}));

	}

}
