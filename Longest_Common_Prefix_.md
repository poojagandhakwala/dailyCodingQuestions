

# Problem Statement
Given a list of strings, return the longest common prefix string which is shared among all of the strings.

## Sample Input
Input: ["flower","flow","flight"] 

## Sample Output
Output: "fl"

## Solution
```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0]; // take the first string as a starting point
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
```