

**Problem Statement**
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

**Sample Input**
nums = [0,1,0,3,12]

**Sample Output**
nums = [1,3,12,0,0]

**Solution**

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}