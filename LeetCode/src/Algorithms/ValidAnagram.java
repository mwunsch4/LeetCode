package Algorithms;

import java.util.HashMap;

//Method returns true if s and t are anagrams
public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
        Character current;
        int count, tLen = t.length(), sLen = s.length();
        
        if (tLen != sLen) {
            return false;
        }
        for (int c = 0; c < sLen; c++) {
            current = (Character) s.charAt(c);
            if (charCount.get(current) == null) {
                count = 0;
            } else {
                count = charCount.get(current);
            }
            count += 1;
            charCount.put(current, count); 
        }
        for (int d = 0; d < tLen; d++) {
            current = (Character) t.charAt(d);
            if (charCount.get(current) == null || charCount.get(current) == 0) {
                return false;
            } else {
                count = charCount.get(current);
                count--; 
                charCount.put(current, count); 
            }
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "anargma"));

	}

}
