## Find the Longest Increasing Subarray

### Problem Statement:
Given an array of integers, find the longest subarray that forms an increasing sequence.

### Explanation:

We initialize maxLength and currentLength to 1. maxLength keeps track of the maximum length of increasing subarrays found so far, and currentLength is the length of the current increasing subarray we are considering.
We iterate through the array starting from the second element (index 1) because the first element is always part of a valid subarray.
For each element at index i, we check if it is greater than the element at index i-1. If it is, we increment currentLength by 1, signifying that this element contributes to the current increasing subarray.
If the current element is not greater than the previous element (i.e., it breaks the increasing sequence), we reset currentLength to 1, as this element is the start of a potential new increasing subarray.
During this iteration, we keep track of the maxLength by updating it whenever we find a longer increasing subarray.
Finally, we return maxLength as the result.

### example:

#### sample Input: [1, 2, 3, 1, 2, 3, 4]

#### sample Output: [1, 2, 3] and its length is 3.

### solution:
``` java
class Solution {
    public int findLongestIncreasingSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;  // At least one element in any subarray
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;  // Reset the length when a non-increasing element is encountered
            }
        }

        return maxLength;
    }
}
```
