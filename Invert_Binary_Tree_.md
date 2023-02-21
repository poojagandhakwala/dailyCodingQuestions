

## Problem Statement
Given a binary tree, invert the binary tree and return it.

**Sample Input:**
 
        4
      /   \
     2     7
    / \   / \
   1   3 6   9

**Sample Output:**
 
        4
      /   \
     7     2
    / \   / \
   9   6 3   1

## Solution
```java
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) 
            return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
```