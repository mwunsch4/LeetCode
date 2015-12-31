package Algorithms;

//Solution to LeetCode problem 66
public class PlusOne {

	//Given a non-negative number represented as an array of digits, 
	//add one to the number.
	public static int[] addOne(int[] digits) {
        for (int c = digits.length - 1; c >= 0; c--) {
            int digit = digits[c];
            digit++;
            if (digit == 10) {
                digits[c] = 0;
                if (c == 0) {
                    int[] answer = new int[digits.length + 1];
                    answer[0] = 1;
                    for (int d = 1; d < digits.length; d++) {
                        answer[d] = 0;
                    }
                    return answer;
                }
            } else {
                digits[c] = digit;
                break;
            }
        }
        return digits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated test array

	}

}
