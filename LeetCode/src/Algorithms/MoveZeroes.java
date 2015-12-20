package Algorithms;

//Given an array nums, write a function to move all 0's to the end 
//of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
	
	//The below method did move the zeroes to the end
	//of the list, but it did not preserve the relative
	//order of other elements
	public static void moveZeroesIncorrect(int[] nums) {
        int numOfZeros = 0, temp, 
            len = nums.length - 1;
        if (len != 0) { 
            for (int c = 0; c <= len; c++) {
                if (nums[c] == 0) {
                    temp = nums[len - numOfZeros];
                    while (temp == 0) {
                        numOfZeros += 1;
                        if (numOfZeros >= len - c) {
                            break;
                        }
                        temp = nums[len - numOfZeros];
                    }
                    nums[c] = temp;
                    nums[len - numOfZeros] = 0;
                    numOfZeros += 1;
                }
                if (numOfZeros >= len - c) {
                    break;
                }
            }
        }
    }
	
	//This version of the method as expected
	public static void moveZeroes(int[] nums) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < nums.length - j; i++) {                                       
                if (nums[i] == 0 ) {                          
                    tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                    swapped = true;
                }
            }                
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
