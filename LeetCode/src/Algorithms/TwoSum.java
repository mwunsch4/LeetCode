package Algorithms;

import java.util.Random;

public class TwoSum {
	public static int[] findTarget(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (j != i){
                    if (nums[i] + nums[j] == target){
                        if (i < j){
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                        } else {
                            answer[0] = j + 1;
                            answer[1] = i + 1;
                        }
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
	
	public static void main(String[] args){
		Random r = new Random();
		int[] numbers = new int[100];
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = r.nextInt(25);
	      System.out.println(numbers[i]);
	    }
	    int target = r.nextInt(25);
		int[] ans = findTarget(numbers, target);
		System.out.println("Target: " + target);
		System.out.println("Index1: " + ans[0] + ", Index2: " + ans[1]);
	}
}
