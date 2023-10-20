# ParenBit

Given a string s that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

#### Input Format

First line contains the string s

#### Output Format

Complete the function ParenBit() which returns the required string

#### Example 1

##### Input

123(abc)xyz

##### Output

(abc)

#### Example 2

##### Input

(hello)x

##### Output

(hello)

#### Constraints

1 <= s.size <= 103

```java

import java.util.*;

class Solution {
    public String ParenBit(String s) {
        // Write your code here
        int n = s.length();

		if(n < 3) return "";

		if(s.charAt(0) == '(' && s.charAt(n-1) == ')'){
			return s;
		}

		if(s.charAt(0) == '('){
			return ParenBit(s.substring(0,n-1));
		}

		if(s.charAt(n-1) == ')'){
			return ParenBit(s.substring(1));
		}

		return ParenBit(s.substring(1,n-1));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
	    Solution Obj = new Solution();
        System.out.println(Obj.ParenBit(s));
    }
}
```
