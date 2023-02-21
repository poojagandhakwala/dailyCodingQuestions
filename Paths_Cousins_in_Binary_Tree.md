

# Problem Statement
Given a binary tree, find the number of paths between two cousins. Two nodes are cousins if they are at the same level and have different parents.

## Sample Input

Tree:
            root
           /     \
          A       B
         / \     / \
        C   D   E   F

## Sample Output

Number of paths between cousins: 2 (C-F and D-E)

## Solution

```java
class Solution {
    int count = 0;

    public int pathCousins(TreeNode root) {
        if (root == null) return 0;
        findPath(root, 0, null);
        return count;
    }

    private void findPath(TreeNode node, int level, TreeNode parent) {
        if (node == null) return;
        if (level > 0 && node.parent != parent) {
            count++;
        }
        findPath(node.left, level + 1, node.parent);
        findPath(node.right, level + 1, node.parent);
    }
}
```