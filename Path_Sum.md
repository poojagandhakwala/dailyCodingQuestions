

# Problem Statement

## Description

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

## Sample Input

```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1

sum = 22
```

## Sample Output

`true`

## Solution

```java
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == sum) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
```