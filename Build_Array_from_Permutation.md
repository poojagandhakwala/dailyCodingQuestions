

# Problem Statement
**Objective**: Given a permutation of distinct numbers, construct an array of size n that contains all the distinct numbers from the permutation. 

**Input**: An array of distinct integers `A[]` of size `n`.

**Output**: An array `B[]` of size `n` containing all the distinct numbers from the permutation `A[]`.

**Example**:

Input: `A[] = {3, 2, 4, 5, 1}`

Output: `B[] = {3, 2, 4, 5, 1}`

**Solution**
```java
class Solution {
    // Function to build an array from a permutation of distinct numbers
    public static int[] buildArray(int[] A) {
        int n = A.length;

        // array to store the result
        int[] B = new int[n];

        // iterate over the array A[]
        for (int i = 0; i < n; i++) {
            B[A[i] - 1] = A[i];
        }

        return B;
    }
}
```