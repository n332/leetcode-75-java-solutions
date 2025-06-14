
# Problem Description

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).  
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.  
[Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75)

# Notes
## Idea
Using Euclidean Algorithm to get the length of gcd  

*gcd(a, b) == gcd(b, a % b)*

- If a number divides both a and b, it must also divide the remainder of a % b.

## Steps
1- check if there is a pattern in the two strings  
2- get the length of the gcd by Euclidean Algorithm  
3- get the actual gcd with is str[0:gcdLenght]

## Time Complexity
O(m+n)