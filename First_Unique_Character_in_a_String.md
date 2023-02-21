

**Problem Statement**: Given a string, find the first non-repeating character in it and return its index. If it does not exist, return -1.

**Sample Input**: 
```
String s = "leetcode"
```

**Sample Output**: 
```
0
```

**Solution**
```java
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}
```