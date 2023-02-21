

## Problem Statement
Given an array of numbers, return an array of the same size where each element is the next greater element of the corresponding input element in the original array. If the next greater element doesn't exist, replace it with -1.

### Sample Input
`[3, 4, 6, 7, 15, 1]`

### Sample Output
`[4, 6, 7, 15, -1, -1]`

## Solution
```java
class Solution {
    public int[] NextGreaterElement(int[] nums) {
        int[] output = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            
            int current = nums[i];
            boolean found = false;
            
            // Iterate through the array to look for the next greater element
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > current) {
                    output[i] = nums[j];
                    found = true;
                    break;
                }
            }
            
            // If no next greater element is found, assign -1 to output
            if (!found)
                output[i] = -1;
        }
        
        return output;
    }
}
```