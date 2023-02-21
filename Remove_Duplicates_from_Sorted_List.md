

**Problem Statement:**
Given a sorted linked list, delete all duplicates such that each element appear only once.

**Sample Input:** 
Given 1->1->2->3->3->4,

**Sample Output:** 
1->2->3->4

**Solution:**
```java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
```