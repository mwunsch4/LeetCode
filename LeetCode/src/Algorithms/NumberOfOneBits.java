package Algorithms;

public class NumberOfOneBits {
	public static int hammingWeight(int n) {
        int count = 0;
        
        for (int c = 0; c < 32; c++) {
            int currentNum = n % 2;
            if (currentNum != 0) {
                count = count + 1;
            } 
            n = n >>> 1;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 429496729;
		System.out.println(hammingWeight(num));
	}

}
