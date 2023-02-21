

# Problem Statement
Given an array of integers `A` sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

**Sample Input:**
`A = [-4, -1, 0, 3, 10]`

**Sample Output:**
`[0, 1, 9, 16, 100]`

# Solution
```java
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (Math.abs(A[left]) > Math.abs(A[right])) {
                result[i] = A[left] * A[left];
                left++;
            } else {
                result[i] = A[right] * A[right];
                right--;
            }
        }
        return result;
    }
}
```