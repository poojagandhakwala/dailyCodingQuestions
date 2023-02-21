

**Problem Statement**

Given an array `nums` of length `n`, rearrange the elements of `nums` such that `nums[0]`, `nums[2]`, `nums[4]`... `nums[n-2]` are the first `n/2` elements of the shuffled array and `nums[1]`, `nums[3]`, `nums[5]`... `nums[n-1]` are the second `n/2` elements of the shuffled array.

**Sample Input**

`nums` = [2, 5, 1, 3, 4, 7]

**Sample Output**

[2, 3, 5, 4, 1, 7]

**Solution**

```java
class Solution {
    public int[] shuffle(int[] nums) {
        int n = nums.length;
        int[] shuffled = new int[n];

        for (int i = 0; i < n; i += 2) {
            shuffled[i] = nums[i / 2];
        }

        for (int i = 1; i < n; i += 2) {
            shuffled[i] = nums[n / 2 + (i / 2)];
        }

        return shuffled;
    }
}
```