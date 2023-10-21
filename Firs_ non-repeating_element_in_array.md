# First non-repeating element in array

Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

## Explanation

There is an integer array of N size. 
The solution is the value of first element that is distinct in the array.

### Example 1

#### Input

-1, 2, -1, 3, 0 

#### Output

2

#### Explanation

The first number that does not repeat is : 2

### Example 2

#### Input

9, 4, 9, 6, 7, 4

#### Output

6

#### Explanation

The first number that does not repeat is : 6


```java
class Arr {
 
    static int firstNonRepeating(int arr[], int n)
    {
        // Loop for checking each element
        for (int i = 0; i < n; i++) {
            int j;
            // Checking if ith element is present in array
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            // if ith element is not present in array
            // except at ith index then return element
            if (j == n)
                return arr[i];
        }
 
        return -1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
 
        System.out.print(firstNonRepeating(arr, n));
    }
}
```
