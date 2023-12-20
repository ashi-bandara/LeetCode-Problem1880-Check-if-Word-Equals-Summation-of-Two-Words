
# LeetCode Challenge D5
## Achievements
[![image.png](https://i.postimg.cc/qqVrYxdv/image.png)](https://postimg.cc/LYTGgfXc)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1880.  Check if Word Equals Summation of Two Words](https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
The task involves converting strings of lowercase English letters, where each letter is assigned a numerical value based on its position in the alphabet, into integers. The objective is to determine if the summation of the numerical values of two given words (`firstWord` and `secondWord`) equals the numerical value of a third word (`targetWord`).



**Example**

>**Input:** firstWord = "acb", secondWord = "cba", targetWord = "cdb"
>
>**Output:** true
>
>**Explanation:**
>
>The numerical value of firstWord is "acb" -> "021" -> 21.
>The numerical value of secondWord is "cba" -> "210" -> 210.
>The numerical value of targetWord is "cdb" -> "231" -> 231.
>We return true because 21 + 210 == 231.

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview

The approach involves creating a helper method, `calculateSum`, which assigns numerical values to letters from 'a' to 'j' based on their positions in the alphabet. The `isSumEqual` function then utilizes this helper method to compute the numerical values for each word and checks if the sum of `firstWord` and `secondWord` is equal to `targetWord`.

The `calculateSum` method initializes an array to store the numerical values, iterates through each letter in the word, and assigns values based on their positions in the alphabet. The assigned values are then converted into an integer using a loop that multiplies the existing sum by 10 and adds the current numerical value. This integer represents the overall numerical value of the word. The main function calculates the sums for `firstWord` and `secondWord` using the `calculateSum` method and checks if their sum is equal to the numerical value of `targetWord`. The final result indicates whether the summation condition is met.





