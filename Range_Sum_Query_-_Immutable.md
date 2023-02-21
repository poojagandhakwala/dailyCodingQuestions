

**Problem Statement:** Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

**Sample Input:** 

nums = [1, 3, 5, 7, 9] 
i = 1 
j = 3

**Sample Output:**

16

**Solution in Java:**

class Solution {
    int[] sum;

    public Solution(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}