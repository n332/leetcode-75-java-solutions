package leetcode27.main;

public class GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        // Step 1: If str1 + str2 != str2 + str1, no common pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: GCD of the lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return prefix of either string with length = gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper: Euclidean algorithm to compute GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    // Test the implementation
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));    // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));   // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));     // Output: ""
    }
}
