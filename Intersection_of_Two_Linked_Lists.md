


### Problem Statement 
Given two singly linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

**Sample Input**

list1 = [3,1,5,9,7,2,1] 
list2 = [4,6] 

**Sample Output**

null

### Solution 
```java
public class Solution {
  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode curA = headA;
    ListNode curB = headB;
    
    while (curA != curB) {
        curA = curA == null ? headB : curA.next;
        curB = curB == null ? headA : curB.next;
    }
    
    return curA;
  }

}
```