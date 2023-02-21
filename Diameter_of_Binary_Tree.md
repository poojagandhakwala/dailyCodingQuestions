

#### Problem Statement
Write a function `diameterOfBinaryTree()` that takes a binary tree as an argument and returns its diameter (the longest path between any two nodes in the tree).

#### Sample Input 
[1, 2, 3, 4, 5]  

#### Sample Output
3

#### Solution
```java
class Solution {
    int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }
}
```