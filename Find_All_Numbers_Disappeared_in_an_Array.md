

## Problem Statement

Given an array `nums` of integers where 1 ≤ `nums[i]` ≤ `nums.length` (`nums.length = n`), some elements appear twice and others appear once.

Find all the elements of `[1, n]` inclusive that do not appear in this array.

**Sample Input:**

`nums = [4,3,2,7,8,2,3,1]`

**Sample Output:**

`[5,6]`

## Solution

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
```