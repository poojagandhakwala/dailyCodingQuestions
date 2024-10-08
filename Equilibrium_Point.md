## Equilibrium Point

### Problem Statement: 

An equilibrium point in an array is an index where the sum of elements at lower indexes is equal to the sum of elements at higher indexes. Write a function to find the equilibrium point in an array if one exists.

### Explanation:

Given an array of integers, you need to find an index 'i' such that the sum of elements at indices 0 to 'i-1' is equal to the sum of elements at indices 'i+1' to 'n-1'. If no equilibrium point exists, return -1.

#### sample input:

arr = [1, 3, 5, 2, 2]

#### sample output:

Equilibrium point: 2
In the given input, the equilibrium point is at index 2 because 1 + 3 = 5. The sum of elements at the lower indices (0 and 1) is equal to the sum of elements at higher indices (3 and 4).

## solution:
``` java

public int findEquilibriumPoint(int[] arr) {
    int n = arr.length;
    int[] prefixSum = new int[n];
    int[] suffixSum = new int[n];
    
    prefixSum[0] = arr[0];
    for (int i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
    
    suffixSum[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        suffixSum[i] = suffixSum[i + 1] + arr[i];
    }
    
    for (int i = 0; i < n; i++) {
        if (prefixSum[i] == suffixSum[i]) {
            return i;
        }
    }
    
    return -1;  // No equilibrium point found
}
```
