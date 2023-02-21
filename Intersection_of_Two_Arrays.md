

**Problem Statement**
Given two arrays, write a function to compute their intersection. 

**Sample Input**

arr1 = [1,3,4,6,7]
arr2 = [3,5,6,8]

**Sample Output**

[3,6]

**Solution (Java)**

class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for (int n : set1) {
            result[i++] = n;
        }
        return result;
    }
}