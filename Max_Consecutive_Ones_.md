

### Problem Statement

Given a binary array, find the maximum number of consecutive 1s in this array.

**Sample Input:** [1,1,0,1,1,1]

**Sample Output:** 3

### Solution

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for (int num : nums) {
            if (num == 1) {
                curr++;
            } else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        return Math.max(max, curr);
    }
}
```