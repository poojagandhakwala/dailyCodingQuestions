

# Problem Statement
Given an array of integers `A`, return `true` if and only if it is a valid mountain array.

A mountain array is an array that is strictly increasing, then strictly decreasing.

## Sample Input
`A = [0,3,2,1]`

## Sample Output
`true`

## Solution
```java
class Solution {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
```