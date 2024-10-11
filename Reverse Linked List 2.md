## Problem Statement

Given the head node and two position values m and n. Your task is to reverse the linked list in the range of m amd n.

Input Format
The first line of contains 3 integers N, m and n. Where N is the number of nodes.

The second line of input contains N space separated integers denoting linked list.

Output Format
Your task is to return the head node after reversing the list.

Example 1
Input

6 2 4
1 2 3 4 5 6
Output

1 4 3 2 5 6
Explanation

The given linked list looks like 1->2->3->4->5->6->NULL , at second position we have 2 and at 4th position we have 4, so after reversing it becomes
1->4->3->2->5->6->NULL
Example 2
Input

1 1 1
5
Output:

5
Explanation:

Linked list looked like 5->NULL , so after reversing, the linked list remains same.
Constraints
1 <= N <= 500

-500 <= value of node <=500

1 <= left <= right <= N

## Solution

```java
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	
}
class Main
{
    public static void main(String args[])throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
            String S[] = br.readLine().split(" ");
			int N = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int n = Integer.parseInt(S[2]);
		
		    String S1[] = br.readLine().split(" ");
			insertion llist = new insertion(); 
			int a1=Integer.parseInt(S1[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = Integer.parseInt(S1[i]);
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		Node newhead=ob.reverseBetween(llist.head, m, n);
		llist.printList(newhead);
    }
}

class Solution
{
    public static Node reverseBetween(Node head, int l, int r)
    {
        //code here
       Node dummy = new Node(0);
		dummy.next = head;
		Node ptr = dummy;
		for(int i=0; i<l-1; i++){
			ptr = ptr.next;
		}

		Node curr = ptr.next;
		Node temp = null;
		Node next = null;
		for(int i=0; i< r- l + 1; i++){
			next = curr.next;
			curr.next = temp;
			temp = curr;
			curr = next;
		}

		ptr.next.next = curr;
		ptr.next = temp;

		return dummy.next;
    }
}`
```
