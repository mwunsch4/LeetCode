package Algorithms;

//Leetcode problem 136
public class SingleNumber {
	
	//Given an array of integers, every element appears twice except for one. Find that single one.
	public static int findSingleNumber(int[] nums) {
		int answer = 0;
		for (int c = 0; c < nums.length; c++) {
			answer ^= nums[c];
			System.out.println(answer);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,3,4,5,6,7,6,5,4,3,2,1};
		System.out.println(findSingleNumber(numbers));
	}
}
