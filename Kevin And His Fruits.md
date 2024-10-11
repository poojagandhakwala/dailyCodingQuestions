## Problem Statement

Kevin has N buckets each consisting of some fruits. Kevin wants to eat at least M fruits and so, he decided to set a marker (integer) as maximum as possible such that if he eats number of fruits in the i-th bucket - marker fruits then it must be at least M.

Note Each bucket may not have the same amount of fruits. It is guaranteed that the sum of all fruits (including all the buckets) will be greater than M. Kevin can only eat fruits from a particular bucket if and only if the bucket has more fruits than the marker.

Input Format
The first line will contain two space-separated integers N and M where N is the total number of buckets, and M is the minimum number of fruits that Kevin wants to eat.

The second line will contain N space-separated integers which denote the number of fruits in the i-th bucket.

Output Format
Print the maximum possible value of the marker.

Example 1
Input

4 30
10 40 30 20
Output

20
Explanation

If we set the marker at 20 then Kevin can eat following fruits from each bucket: 0 (1st bucket) + 20 (2nd bucket) + 10 (3rd bucket) + 0 (4th bucket) = 30 (K).

Example 2
Input

4 16
5 8 20 1
Output

6
Explanation

If we set the marker at 6 then Kevin can eat following fruits from each bucket: 0 (1st bucket) + 2 (2nd bucket) + 14 (bucket) + 0 (4th bucket) = 16 (K)

Constraints
1 <= N <= 10^4

1 <= M <= 10^6

0 <= ARR[i] <= 10^4

## Solution

```java
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                int [] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                int aa = fruit(arr,m);
                System.out.println(aa);
	}
        public static int fruit(int [] arr, int m){
                int l = 1;
                int r = Integer.MIN_VALUE;
                for(int val: arr){
                        r = Math.max(val, r);
                }
                int ans = 0;
                while(l <= r){
                        int marker = (l + r) / 2;
                        if(isCorrect(arr,marker,m)){ // this return true if (ans1 >= total fruit eat kevin) 
                                ans = marker;
                                l = marker + 1; //at time kevin eat more then the fruit they want to eat. this means left move and find the correct marker.
                        }
                        else{
                                r = marker - 1; // if (ans1 <= total fruit eat kevin)
                        }
                }
                return ans;
        }
        public static boolean isCorrect(int [] arr, int marker, int m){
                int ans1 = 0;
                for(int i=0; i<arr.length; i++){
                        int temp = arr[i] - marker; // that means if (arr[i] > marker) so, add in ans1.
                   if(temp > 0){
                           ans1 += temp;
                   }
                }
                if(ans1 >= m){ // if ans1 is greater then or equal to kevin want to eat fruit. another false.
                        return true;
                }
                return false;
        }
}
```
