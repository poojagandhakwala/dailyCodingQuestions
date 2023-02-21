

**Problem Statement**:
Given the head of a singly-linked list, reverse the linked list and return the new head.

**Input**: A singly-linked list head node.

**Output**: Reversed singly-linked list head node.

**Solution (Java)**:
```java
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
```