

# Problem Statement

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

**Sample Input**

nums = [1,1,2]

**Sample Output**

len = 2

**Solution in Java**

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        int prev = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num != prev) {
                nums[len] = num;
                len++;
                prev = num;
            }
        }
        return len;
    }
}
```