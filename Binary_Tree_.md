


# Problem Statement
Given a binary tree, create a method to print out all paths from the root to the leaf nodes, with each path's elements separated by a space.

## Sample Input 
```
   1 
  / \ 
 2   3
```

## Sample Output
```
1 2 
1 3 
```


## Solution 
```java
class Solution {
    void printPaths(TreeNode root) {
        int[] path = new int[1000];
        printPathsRecur(root, path, 0);
    } 

    void printPathsRecur(TreeNode node, int[] path, int pathLen) {
        if (node == null) return;
        
        // append this node to the path array
        path[pathLen] = node.val;
        pathLen++;

        // it's a leaf, so print the path that led to here
        if (node.left == null && node.right == null)
            printArray(path, pathLen);
        else {
            // otherwise try both subtrees
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    } 

    void printArray(int[] ints, int len) {
        int i;
        for (i = 0; i < len; i++) 
            System.out.print(ints[i] + " ");
        System.out.println("");
    }
}
```