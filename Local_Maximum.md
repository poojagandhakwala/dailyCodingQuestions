### Problem Statement

Given an array 'A' with 'N' positive integers. The array follows a special property:

For some i with 0 < i < N - 1 :

A[0] < A[1] < ... < A[i - 1] < A[i] and A[i] > A[i + 1] > ... > A[N - 1].

Your task is to find the index i in 0-based indexing.

Note: There always exists such an index.

Input Format
The first line contains an integer 'N' denoting the number of elements.

The second line contains N-space-separated integers denoting the elements of the array 'A'.

Output Format
Print a single integer in a new line, denoting the required index.

Example 1
Input:

5
0 3 5 2 1
Output:

2
Explanation:

Since A[0] < A[1] < A[2] and A[2] > A[3] > A[4] ,the answer is 2.

Example 2
Input:

4
1 3 1 0
Output:

1
Explanation:

Since A[0] < A[1] and A[1] > A[2] > A[3] ,the answer is 1.

Constraints
3 <= N <= 10^4
0 <= A[i] <= 10^6


### Solution 

```java
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String str = sc.next();

                String ans = isValid(str);
                System.out.println(ans);
                
        }
        public static String isValid(String str){
              Stack<Character> st = new Stack<>();
                String aaa = "NO";
                for(int i=0; i<str.length(); i++){
                        //char ch = str.charAt(i);
                        if(str.charAt(i) =='(' || str.charAt(i) == '{' || str.charAt(i) == '['){ // this is push the only open Brackets.
                                st.push(str.charAt(i));
                        }
                        else{
                                if(st.size() > 0 && isClose(st.peek(), str.charAt(i))){ // this check for if Open brackets must be closed by the same type of colse brackets ans stack is not empty then peek of element is delete. 
                                        st.pop();
                                }
                                else{
                                       return aaa; // if not match then return "NO".
                                }
                        }
                }
                if(st.size() == 0){
                       aaa = "YES";
                }
               return aaa;
        }
        public static boolean isClose(char op, char cl){ // this function is check for match or not. 
                if(op == '(' && cl == ')'){
                        return true;
                }
                if(op == '{' && cl == '}'){
                        return true;
                }
                if(op == '[' && cl == ']'){
                        return true;
                }
                return false;
        }
}
```
