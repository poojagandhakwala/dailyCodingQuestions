

**Problem Statement**

Given a linked list, determine if it contains a cycle.

**Input**

A linked list 

**Output**

Boolean value, True if the linked list contains a cycle, False otherwise.

**Solution (Java)**

```
public class Solution {
   public boolean hasCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
         if (slow == fast) {
            return true;
         }
      }
      return false;
   }
}
```