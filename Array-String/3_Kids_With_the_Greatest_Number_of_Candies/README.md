
# Problem Description

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

[Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75)

# Notes
## boolean[] vs List<Boolean>
| Feature           | `List<Boolean>`              | `boolean[]`                  |
| ----------------- | ---------------------------- | ---------------------------- |
| **Memory usage**  | Higher (boxing overhead)     | Lower (primitive values)     |
| **Performance**   | Slightly slower (autoboxing) | Faster (direct access)       |
| **Flexibility**   | Easy to resize               | Fixed size only              |
| **Best use case** | General-purpose collections  | High-performance, fixed size |


## Time Complexity
Time: O(n) — One pass to find the max, one to check each kid. 
