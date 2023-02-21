

## Problem Statement

Given a singly linked list, determine if it is a palindrome.

### Sample Input

Input: `1 -> 2 -> 3 -> 2 -> 1`

### Sample Output

Output: `true`

## Solution

```java
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<>();
        
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (fast != null) {
            slow = slow.next;
        }
        
        while (slow != null) {
            int top = stack.pop().intValue();
            if (top != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        
        return true;
    }
}
```