package leetcode27.main;

import java.util.*;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        // Step 1: Find the current maximum candies
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        // Step 2: Check each kid with extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
        // Output: [true, true, true, false, true]
    }
}

