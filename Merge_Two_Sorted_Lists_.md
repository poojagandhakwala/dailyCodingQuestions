

# Problem Statement

Given two sorted linked lists, create a new sorted linked list that is the combination of the two sorted linked lists.

#### Sample Input
list1: [1, 3, 5]
list2: [2, 4, 6]

#### Sample Output
newList: [1, 2, 3, 4, 5, 6]

#### Solution

```Java
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }
        return dummy.next;
    }
}
```