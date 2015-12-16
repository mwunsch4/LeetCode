package Algorithms;

import java.util.Random;

public class AddDigits {
	public static int addDigits(int num) {
        int sum = 0, digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        if (sum < 10) {
            return sum;
        } else {
            return addDigits(sum);
        }
    }
	
	public static int quickAddDigits(int num) {
        int answer = num % 9;
        if (answer == 0 && num != 0) {
            return 9;
        } else {
            return answer;
        }
	}
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(1000);
		System.out.println("Input: " + num);
		Integer number = new Integer(num);
		System.out.println("Quick Output: " + quickAddDigits(num));
		System.out.println("Output: " + addDigits(num));

	}

}
