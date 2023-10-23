

## Interview Coding Question

### Problem Statement

You are given an array of integers, `nums`, and an integer `target`. Your task is to find all unique quadruplets in the array that sum up to the given `target`. Return a list of all such quadruplets, and the quadruplets should be sorted in ascending order.

Write a function `findQuadruplets` in Java that takes the following parameters:

```java
public List<List<Integer>> findQuadruplets(int[] nums, int target) {
    // Your code here
}
```

**Input:**
- An array of integers `nums` where `nums.length >= 4` and `-10^9 <= nums[i] <= 10^9`.
- An integer `target` where `-10^9 <= target <= 10^9`.

**Output:**
- A list of lists where each inner list represents a unique quadruplet.

**Note:**
- The solution set must not contain duplicate quadruplets.
- Quadruplets are sorted in ascending order.

### Example

```java
int[] nums = {1, 0, -1, 0, -2, 2};
int target = 0;
List<List<Integer>> result = findQuadruplets(nums, target);

// Expected output:
// [
//   [-2, -1, 1, 2],
//   [-2, 0, 0, 2],
//   [-1, 0, 0, 1]
// ]
```

### Constraints

- Solutions must have a time complexity of O(n^3).

---

## Solution

Here's a Java solution to the problem:

```java
import java.util.*;

public class QuadrupletSum {
    public List<List<Integer>> findQuadruplets(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        QuadrupletSum solution = new QuadrupletSum();
        List<List<Integer>> result = solution.findQuadruplets(nums, target);
        System.out.println(result);
    }
}
```

This solution uses a two-pointer approach to find unique quadruplets that sum up to the target. It avoids duplicates by skipping identical elements. The time complexity of this solution is O(n^3), as required.
