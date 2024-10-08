# Rearrange Even Odd Nodes

Rewrite the given linked list such that all even numbers are placed before all odd numbers, while maintaining the original order of the numbers within each group.

#### Note

Do not create a new linked list, but modify the existing one.

#### Input Format

Input is handled by driver code you will be given the head of the linked list.

#### Output Format

Return the modified linked list's head.

#### Example 1

##### Input

5

1 2 3 4 5

##### Output

2 4 1 3 5

##### Explanation

We have rearranged the even nodes 2, 4 to come before the odd nodes 1, 3, 5.


#### Example 2

##### Input

10

2 4 6 8 10 1 3 5 7 9

##### Output

2 4 6 8 10 1 3 5 7 9

##### Explanation

The nodes are already arranged as required.

#### Constraints
1 <= n <= 10^5

1 <= nodes.val <= 10^5

```java

import java.util.*;

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public Node rearrangeList(Node head) {
        //Write code here
		if (head == null || head.next == null) {
            return head;
        }
        
        Node evenHead = null;
        Node evenTail = null;
        Node oddHead = null;
        Node oddTail = null;
        
        Node curr = head;
        
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = null; 
            
            if (curr.val % 2 == 0) {
                
                if (evenHead == null) {
                    evenHead = curr;
                    evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            } else {
             
                if (oddHead == null) {
                    oddHead = curr;
                    oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }
            
            curr = nextNode;
        }
        
        if (evenTail != null) {
            evenTail.next = oddHead;
        } else {
            return oddHead;
        }
        
        return evenHead;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
        //llist.printList(head);
        Solution Obj = new Solution();
        head = Obj.rearrangeList(head);
        llist.printList(head);
        sc.close();
    }
}

```
