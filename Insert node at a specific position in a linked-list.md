## Problem Statement

Given a linked list and an integer to insert at a certain position, create a new node with the given integer as its data attribute, insert this node at the desired position and print the new linked list.

A position of 0 indicates head, a position of 1 indicates one node away from the head and so on.

Input Format
The first line contains an integer n, the number of elements in the linked list.

The next line contains n spaced integers data of the nodes of the linked list.

The last line contains two spaced integers, the data of the new node to be inserted and the position at which it should be inserted.

Output Format
The only line contains (n+1) spaced integers, the new elements of the linked list, from head to tail.

Example 1
Input

3 
16 13 7 
1 2
Output

16 13 1 7
Explanation

The initial linked list is 16->13->7. Insert 1 at the position 2, which currently 7 has in it. The updated linked list is 16->13->1->7

Example 12
Input

5
1 2 3 5 6 
4 3
Output

1 2 3 4 5 6
Explanation

The initial linked list is 1->2->3->5->6. Insert 4 at the position 4, which currently 5 has in it. The updated linked list is 1->2->3->4->5->6

Constraints
1 <= n <= 100

1 <= data of node <= 1000

0 <= position <= n

## Solution

```java
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                Node head = null;
                Node ptr = head;
                for(int i=0; i<n; i++){
                Node temp = new Node(sc.nextInt());
                        if(head == null){
                                head = temp;
                                ptr = head;
                                continue;
                        }
                        ptr.next=temp;
                        ptr = ptr.next; 
                }
                int data = sc.nextInt();
                int pos = sc.nextInt();

                head = ins(head,data,pos);
                print(head);
	}
        public static void print(Node head){
                Node ptr = head;
                while(ptr != null){
                        System.out.print(ptr.data + " ");
                        ptr = ptr.next;
                }
        }
        public static Node ins(Node head, int data, int pos){
                
                Node ptr = head;
                Node tail = head.next;
                Node temp = new Node(data);
                if(pos == 0){
                        temp.next = head;
                        head = temp;
                        return head;
                }
                for(int i=0; i<pos-1; i++){
                        ptr = tail;
                        tail = tail.next;
                }
                ptr.next = temp;
                temp.next = tail;
               
                return head;
        }
}
class Node{
        int data;
        Node next;
        Node(int data){
                this.data = data;
                next = null;
        }
        
}
```
