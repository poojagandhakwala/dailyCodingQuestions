# Selection Sort

Given an unsorted array consisting of N non-negative integers. Sort the array in non-decreasing order using the Selection Sort algorithm.

## Explanation

In the first step, the minimum element is 11. Thus it is swapped with the starting element of the unsorted region.
In the second step, 12 is the minimum element. Now, it is swapped with the starting element of the unsorted region.
Similarly, in the third step, the minimum element is 22, which is swapped accordingly.
In the final step, all elements are arranged as per the non-decreasing order. Thus the array is sorted. 

### Input Format

The first line of input contains an integer 'T' representing the number of test cases. Then the test case follows.

The first line of each test case contains integer 'N' denoting the size of the array.

The second line of each test case contains 'N' single space-separated integers representing the array elements.

### Output Format

The only line of output of each test case should contain the given array sorted in non-decreasing order.

### Constraints

1 <= T <= 100
1 <= N <= 100
1 <= Arr[i] <= 1000

Where 'T' represents the number of test cases, 'N' represents the size of the array, and 'Arr[i]' represents the elements of the array.

### Example 1

#### Input

64,25,12,22,11

#### Output

11 12 22 25 64


### Example 2

#### Input

89,23,67,50,18,99

#### Output

18 23 50 67 89 99

```java
import java.io.*;
public class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
```
