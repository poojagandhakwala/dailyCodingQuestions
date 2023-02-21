

**Problem Statement**
Given an array of n integers, return an array of running sum of all elements from left to right.

**Sample Input**
arr = [1,2,3,4]

**Sample Output**
[1,3,6,10]

**Solution**
```java
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
```