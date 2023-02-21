

# Problem Statement
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value. 

## Sample Input
```
Tree 1:
    1
   / \
  2   3
  
Tree 2:
    1
   / \
  2   3
```
## Sample Output
True

## Solution
```java
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
```