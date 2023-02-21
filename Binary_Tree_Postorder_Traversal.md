

# Problem Statement
Given a binary tree, return the postorder traversal of its nodes' values.

## Sample Input 
* Tree:
 
       1
      / \
     2   3
    / \
   4   5

## Sample Output 
[4, 5, 2, 3, 1]

## Solution
```java
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        postOrderTraversal(root, list);
        return list;
    }
    
    private void postOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left, list);
        postOrderTraversal(node.right, list);
        list.add(node.val);
    }
}
```