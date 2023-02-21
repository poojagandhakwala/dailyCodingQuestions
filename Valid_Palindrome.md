

## Problem Statement

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

**Sample Input:**
"A man, a plan, a canal: Panama"

**Sample Output:**
true

## Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
        String filteredStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int strLength = filteredStr.length();
        int i = 0;
        int j = strLength - 1;
        while (i < j) {
            if (filteredStr.charAt(i) != filteredStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
```