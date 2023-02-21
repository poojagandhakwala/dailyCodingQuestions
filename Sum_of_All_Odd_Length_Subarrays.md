

## Problem Statement:

Given an array of positive integers nums, calculate the sum of all odd length subarrays.

**Input:** 
nums = [1,4,2,5,3]

**Output:**
58 

**Explanation:**
The odd length subarrays of nums and their respective sums are:

[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15

**Sum of all odd length subarrays = 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58**

## Solution

```java
class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((j - i + 1)  2 != 0) {
                    for (int k = i; k <= j; k++) {
                        sum += nums[k];
                    }
                }
            }
        }
        return sum;
    }
}
```