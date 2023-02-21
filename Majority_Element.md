

**Problem Statement:**
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

**Sample Input:**
[3,2,3]

**Sample Output:**
3

**Solution:**
```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, majorityElement = 0;
        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
            }
            if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;
    }
}
```