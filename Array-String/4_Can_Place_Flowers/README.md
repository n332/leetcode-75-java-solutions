
# Problem Description

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

[Can Place Flowers](https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75)

# Notes
## Best practices
- **Greedy logic**: Plant a flower at the earliest safe spot.

- **Efficient loop**: Skip checking the next index (i++) once a flower is planted to avoid adjacency violation.

## Time Complexity
Time: O(n) — single pass through the array. 
