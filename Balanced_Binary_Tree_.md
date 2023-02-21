

## Problem Statement
Given a binary tree, determine if it is height-balanced.

A height-balanced binary tree is a tree where the heights of the two subtrees of any node never differ by more than one.

### Sample Input

```
     3
   /   \
  9     20
 / \   /  \
1   4 15   7
```

### Sample Output

`true`

## Solution

```java
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
```