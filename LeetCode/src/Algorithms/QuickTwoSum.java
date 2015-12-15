package Algorithms;
import java.util.*;

public class QuickTwoSum {
	
	//findTarget accepts an array of integers and an integer target
	//and returns the index of any two integers from the array that sum to target 
	public static int[] findTargetQuick(int[] nums, int target) {
		int[] answer = new int[2];
		HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
		
		//Populate HashMap with key = value and value = list of index of nums
		for (int c = 0; c < nums.length; c++) {
			List<Integer> lst;
			if (hm.get(nums[c]) == null) {
				lst = new ArrayList<Integer>();
				lst.add(c);
				hm.put(nums[c], lst);
			} else {
				lst = hm.get(nums[c]);
				lst.add(c);
				hm.put(nums[c], lst);
			}
		}
		
		//Iterate over nums and search HashMap for needed number
		for (int d = 0; d < nums.length; d++) {
			
			//diff is the number that is needed to sum to target
			int diff = target - nums[d];
			
			if (hm.get(diff) != null) {
				List<Integer> idxList = hm.get(diff);
				for (Integer idx: idxList) {
					if (idx != d) {
						//Following if/else is to get index order correct in output
						if (idx < d){
		                    answer[0] = idx + 1;
		                    answer[1] = d + 1;
		                } else {
		                    answer[0] = d + 1;
		                    answer[1] = idx + 1;
		                }
		                return answer;
					}
				}
			}
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] numbers = new int[100];
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = r.nextInt(25);
	      System.out.println(numbers[i]);
	    }
	    int target = r.nextInt(25);
		int[] ans = findTargetQuick(numbers, target);
		System.out.println("Target: " + target);
		System.out.println("Index1: " + ans[0] + ", Index2: " + ans[1]);

	}

}
