# Find All Anagrams

Given two strings s and p, return an array of all the start indices of p's anagrams in s.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Input Format:
First line contains string s.

Second line contains string p.

### Output Format:
Return all the starting indexes of p's anagram in s in sorted order.

#### Example 1

##### Input

cbaebabacd

abc

##### Output

0 6 


### Explanation

The substring with start index = 0 is `cba`, which is an anagram of `abc`.
The substring with start index = 6 is `bac`, which is an anagram of `abc`.

#### Example 2

##### Input

abab

ab

##### Output

0 1 2


### Explanation

The substring with start index = 0 is `ab`, which is an anagram of `ab`.
The substring with start index = 1 is `ba`, which is an anagram of `ab`.
The substring with start index = 2 is `ab`, which is an anagram of `ab`.

### Constraints
1 <= s.length, p.length <= 3 * 10^4

sand p consists of lowercase English letters.


```java

import java.util.*;
import java.io.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //Write code here and print
            List<Integer> ans = new ArrayList<>();
            int m= s.length();
            int n = p.length();
            if(n  > m){
                    return ans;
            }
            int pfre [] = new int [26];
            for(int i=0; i<n; i++){
                    pfre[p.charAt(i) - 'a']++;
            }
            int sfre[] = new int[26];
            for(int i=0; i<n; i++){
            sfre[s.charAt(i) - 'a']++;
           }

            if(checkSame(sfre,pfre)){
                    ans.add(0);
            }
            for(int i=n; i<m; i++){
                    sfre[s.charAt(i) -'a']++;
                    sfre[s.charAt(i-n)-'a']--;
                    if(checkSame(sfre,pfre)){
                            ans.add(i-n+1);
                    }
            }
            return ans;
  }
        public boolean checkSame(int [] sfre, int [] pfre){
                for(int i=0; i<26; i++){
                        if(sfre[i] != pfre[i]){
                                return false;
                        }
                }
                return true;
        }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String s = sc.next();
        int m;
        m = sc.nextInt();
        String p = sc.next();
        Solution Obj = new Solution();
        List<Integer> res = Obj.findAnagrams(s, p);
        for(int i=0;i<res.size();i++)
            System.out.print(res.get(i) + " ");        
        System.out.println('\n');
    }
}
```
