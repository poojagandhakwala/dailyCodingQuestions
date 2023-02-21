

**Problem Statement**

Given an array of integers and a target number, return the indices of the two numbers such that they add up to the target.

**Sample Input**

`nums` = [2, 7, 11, 15], `target` = 9

**Sample Output**

`[0, 1]`

**Solution**

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }
}
```