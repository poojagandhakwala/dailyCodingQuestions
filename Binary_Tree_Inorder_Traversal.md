

# Problem Statement
Given a binary tree, return the inorder traversal of its nodes' values.

## Sample Input 
```
      1
    /   \
   2     3
 / \
4   5
```

## Sample Output
`[4, 2, 5, 1, 3]`

## Solution
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    
    private void helper(TreeNode curr, List<Integer> res) {
        if (curr != null) {
            if (curr.left != null) {
                helper(curr.left, res);
            }
            res.add(curr.val);
            if (curr.right != null) {
                helper(curr.right, res);
            }
        }
    }
}
```