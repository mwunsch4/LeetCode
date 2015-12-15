package Algorithms;

public class TwoSum {
	public static int[] sum(int[] nums, int target) {
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
		int[] numbers = {2,7,11,15};
		int[] ans = sum(numbers, 9);
		System.out.println(ans[0] + "," + ans[1]);
	}
}
