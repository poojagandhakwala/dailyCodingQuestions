

**Problem Statement**

Given two strings *s* and *t* , write a function to determine if *t* is an anagram of *s*.

**Sample Input**

s = "anagram", t = "nagaram"

**Sample Output**

true

**Solution (Java)**

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        // Create array to store character counts
        int[] charCount = new int[26];
        // Iterate through s and increment counts
        for(char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        // Iterate through t and decrement counts
        for(char c : t.toCharArray()) {
            charCount[c - 'a']--;
        }
        // Check if all counts are 0
        for(int count : charCount) {
            if(count != 0) {
                return false;
            }
        }
        // Return true if all counts are 0
        return true;
    }
}
```