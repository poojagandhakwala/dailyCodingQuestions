

## Problem Statement

Given a singly linked list and a **value**, delete all nodes with the given **value**.

**Sample Input:**
```
list = [1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6]
value = 6

```
**Sample Output:**
```
list = [1 -> 2 -> 3 -> 4 -> 5]
```

## Solution
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
```