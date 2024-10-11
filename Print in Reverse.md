## Problem Statement

Given an integer n denoting number of elements in linked list. And then we are given n integers where the ith integer denoted ith element of linked list. We need to print the linked list in reverse i.e from tail to head.

Your task is to complete the function reverse which receives the head of the linked list as parameter and prints the linked list in reverse order.

Input Format
The First line of input contains a single integer n denoting size of linked list The Second line contains n integers where ith integer denotes ith element of linked list

Output Format
Ouput linked list in reverse order i.e from last node(tail) to head node

Example 1
Input

5
2 6 8 10 1
Output:

1 10 8 6 2
Example 2
Input

6
1 2 3 4 5 6
Output:

6 5 4 3 2 1
Constraints:
1 <= n <= 5*10^3

## Solution

```java

public class Main
{
    public static void printRev(Node head){ // This recurtion approch to print reverse link list.
      Node ptr = head;
      if(ptr == null){
        return;
      }
      printRev(ptr.next);
      System.out.print(ptr.data + " ");
    }

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
        ptr = temp;
      }

      printRev(head);
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
