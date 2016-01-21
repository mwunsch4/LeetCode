package Algorithms;

import java.util.Random;

public class isPowerOfTwo {
	public static boolean powerOfTwo(int n) {
        if ((n <= 2) && (n > 0)) {
            return true;
        }
        if (n % 2 != 0 || n == 0) {
            return false;
        } else {
            return powerOfTwo(n/2);
        }
    }
	public static void main(String[] args) {
		Random r = new Random();
		int test = r.nextInt(100);
		System.out.println("Test Value: " + test);
		System.out.println("Is a power of two: " + powerOfTwo(test));
	}

}
