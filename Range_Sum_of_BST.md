

## Problem Statement 
Given the root node of a Binary Search Tree (BST) and an integer `lower` and `upper`, return the sum of all elements of the BST that lie in the range `[lower, upper]` inclusive. 

#### Sample Input and Output

```
Input: root = [10,5,15,3,7,null,18], lower = 7, upper = 15
Output: 32
```

#### Solution

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public int rangeSumBST(TreeNode root, int lower, int upper) {
        if (root == null) {
            return 0;
        }
        
        int sum = 0;
        
        if (root.val >= lower && root.val <= upper) {
            sum += root.val;
        }
        
        if (root.val > lower) {
            sum += rangeSumBST(root.left, lower, upper);
        }
        
        if (root.val < upper) {
            sum += rangeSumBST(root.right, lower, upper);
        }
        
        return sum;
    }
}
```