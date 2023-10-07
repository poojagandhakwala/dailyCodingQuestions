# Hashing for Pair
You are given an array arr (distinct integers) of size n, and you are also given a sum. You need to find if two numbers in arr exists that have sum equal to the given sum.

### Input Format
The first line contains two integers n and sum denoting size of array and target value.

Next line contains n separated integers denoting elements of array.

### Output Format
Print "1"(without quotes) if any pair found, othwerwise print "0"(without quotes) if not found.

### Example 1

##### Input

4 9

2 7 5 11

##### Output

1

##### Explanation

2 + 7 = 9

### Example 2

##### Input

1 2 3 4

6

##### Output

0

##### Explanation

No two elements sums to 6.

### Constraints
1 <= n <= 10^5

1 <= sum <= 10^5

1 <= arr[i] <= 10^4

```java

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int [] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                boolean flag = false;
                for(int i=0; i<n; i++){
                        if(map.containsKey(k-arr[i])){
                                flag = true;
                                break;
                        }
                        else{
                                map.put(arr[i],i);
                        }
                }
                if(flag){
                        System.out.println(1);
                }
                else{
                        System.out.println(0);
                }
	}
}
```
