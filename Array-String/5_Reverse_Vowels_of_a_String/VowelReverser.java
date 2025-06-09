package leetcode27.main;

import java.util.*;

public class VowelReverser {

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        );

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Two-pointer approach
        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }

            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        VowelReverser vr = new VowelReverser();

        System.out.println(vr.reverseVowels("IceCreAm"));  // AceCreIm
        System.out.println(vr.reverseVowels("leetcode"));  // leotcede
    }
}
