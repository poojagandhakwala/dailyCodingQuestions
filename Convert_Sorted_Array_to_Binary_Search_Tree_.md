

##Problem Statement
Given an array of sorted numbers, write a function to convert the array into a balanced Binary Search Tree.

##Sample Input
`[1, 2, 3, 4, 5, 6, 7]`

##Sample Output

```
     4
   /   \
  2     6
 / \   / \
1   3 5   7
```

##Solution
```java
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = convertArrayToBST(nums, 0, nums.length - 1);
        return root;
    }
    
    public TreeNode convertArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convertArrayToBST(nums, start, mid - 1);
        node.right = convertArrayToBST(nums, mid + 1, end);
        return node;
    }
}
```