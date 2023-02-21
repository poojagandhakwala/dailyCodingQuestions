

**Problem Statement**:  
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

**Sample Input**: 
A = [3,1,2,4]

**Sample Output**: 
[2,4,3,1]

**Solution**: 

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i]  2 == 0) {
                res[start++] = A[i];
            } else {
                res[end--] = A[i];
            }
        }
        return res;
    }
}