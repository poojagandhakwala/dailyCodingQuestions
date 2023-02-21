

## Problem Statement

Given two strings s1 and s2, return a new string containing only the common characters between s1 and s2. 

**Sample Input**

s1 = "apple"
s2 = "melon"

**Sample Output**

"ae"

## Solution

```java
public class Solution {
    public String findCommonCharacters(String s1, String s2) {
        StringBuilder common = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) != -1) {
                common.append(s1.charAt(i));
            }
        }
        return common.toString();
    }
}
```