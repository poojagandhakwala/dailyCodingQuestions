# Reverse First K elements of Queue

Given an integer K and a queue of integers with N elements, your task is to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

### Input Format

The first line of input contains two integers N and K, the next line contains N space-separated integers depicting values in queue.

### Output Format

You need to print the modified Queue.

#### Example 1

##### Input:

5 3

1 2 3 4 5

##### Output:

3 2 1 4 5

##### Explanation:

1 2 3 are first K elements. Thus after reversing them, the final list is 3 2 1 4 5.

### Constraints

1 <= K <= N <=10000

1 <= elements <=10000

```java

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
          public static void reverseElement(Queue<Integer>que, int k){
                Queue<Integer> q = new LinkedList<Integer>();
                int arr[] = new int[k];
                for(int i=0; i<k; i++){
                        arr[i] = que.remove();
                }
                for(int i=k-1; i>=0; i--){
                        q.offer(arr[i]);
                }
                for(int x : que){
                        q.offer(x);
                }
                for(int x : q){
                        System.out.print(x + " ");
                }
        }
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
             Queue<Integer> que = new LinkedList<Integer>();
                  for(int i=0; i<n; i++){
                        que.add(sc.nextInt());
                  }
                reverseElement(que,k);
    }
}
```
