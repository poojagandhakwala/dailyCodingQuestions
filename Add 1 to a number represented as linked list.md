## Problem Statement

Given a number N, you have to represent it in Linked List such that each digit corresponds to a node in linked list.

After forming the linked list, you have to add 1 to the number and then print the updated linked list.

Input Format
The only line inputs N, an integer.

Output Format
Print the updated linked list in a new line.

Example 1
Input

456
Output

4 5 7
Explanation

The number is represented in the linked list as 4 -> 5 -> 7.

Example 2
Input

25
Output

2 5
Explanation

The number is represented in the linked list as 2 -> 5 .

Constraints
1 ≤ N < 10^9

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

      while(n > 0){
        int rem = n % 10; 
        n = n / 10;

        Node temp = new Node(rem); 
        if(head == null){ 
          head = temp;
          ptr = head;
          continue;
        }
        ptr.next = temp;
        ptr = ptr.next;
      }
      int carry =1; 
      ptr = head; 
      while(ptr != null){
        int data = ptr.data;
        data = data + carry;
        int rem = data % 10;
        ptr.data = rem;
        carry = data / 10; 
        ptr = ptr.next; 
      }
      ptr = head; 
      if(carry != 0){ 
        Node temp = new Node(carry); 
        while(ptr.next != null){ 
          ptr = ptr.next;
        }
        ptr.next =temp; 
      }
      head = reverse(head);
      ptr = head;
      while( ptr != null){
        System.out.print(ptr.data + " ");
        ptr = ptr.next;
      }
    }  
  public static Node reverse(Node head){ 
    Node prev = null; 
    Node curr = head; 
    while(curr != null){
      Node rigth = curr.next;
      curr.next = prev; 
      prev = curr; 
      curr = rigth; 
    }
    return prev;
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
