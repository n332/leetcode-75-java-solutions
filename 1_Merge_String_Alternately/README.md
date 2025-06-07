
# Problem Description

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

# Notes
## Data structure and Space Complexity
**StringBuilder** => O(m+n)  
**repeated concatenation** => O((m+2)^2)  
*where m = word1.length & n = word2.length*

## Time Complexity
**while loop** => O(min(m,n)) *with 2 appends (constant time)*  
**leftover (if condition)** => O(|m-2|)  
**total** => O(m+n)


