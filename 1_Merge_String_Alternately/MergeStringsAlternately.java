package leetcode27.main;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, len1 = word1.length(), len2 = word2.length();
        
        // Merge characters alternately
        while (i < len1 && i < len2) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            i++;
        }

        // Append the remaining part of the longer string
        if (i < len1) {
            merged.append(word1.substring(i));
        } else if (i < len2) {
            merged.append(word2.substring(i));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));   // Output: "apbqcr"
        System.out.println(mergeAlternately("ab", "pqrs"));   // Output: "apbqrs"
        System.out.println(mergeAlternately("abcd", "pq"));   // Output: "apbqcd"
    }
}

