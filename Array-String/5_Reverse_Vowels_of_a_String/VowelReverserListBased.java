package leetcode27.main;

import java.util.*;

public class VowelReverserListBased {
    
    public String reverseVowels(String s) {
        List<Character> vowelsList = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        List<Character> foundVowels = new ArrayList<>();
        List<Integer> positions = new ArrayList<>();

        // Collect vowels and their positions
        for (int i = 0; i < s.length(); i++) {
            if (vowelsList.contains(s.charAt(i))) {
                foundVowels.add(s.charAt(i));
                positions.add(i);
            }
        }

        // Reverse the list of vowels
        Collections.reverse(foundVowels);

        // Convert original string to char array to modify it
        char[] result = s.toCharArray();

        // Replace vowels at recorded positions with reversed vowels
        for (int i = 0; i < positions.size(); i++) {
            result[positions.get(i)] = foundVowels.get(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        VowelReverserListBased rev = new VowelReverserListBased();
        System.out.println(rev.reverseVowels("IceCreAm"));  // AceCreIm
        System.out.println(rev.reverseVowels("leetcode"));  // leotcede
    }
}
