package Algorithms;

import java.util.Random;

public class ClimbStairs {
	
	//This method takes a number of stairs, n, as input
	//and outputs the number of distinct ways to get to 
	//the top, taking either one or two steps at a time
	public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        } else {
        	//solutionArray will be used for a dynamic programming 
        	//approach. This avoids inefficient recursion.
            int[] solutionArray = new int[n+1];
            for (int c = 0; c <= n; c++) {
                if (c <= 3) {
                    solutionArray[c] = c;
                } else {
                    solutionArray[c] = solutionArray[c-1] + solutionArray[c-2];
                }
            }
            return solutionArray[n];
        }
    }
	public static void main(String[] args) {
		Random r = new Random();
		int test = r.nextInt(100);
		System.out.println("Number of stairs: " + test);
		System.out.println("Distinct paths: " + climbStairs(test));
	}

}
